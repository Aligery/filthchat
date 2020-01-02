package ru.shitandsticks.filthchat;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@ComponentScan({"ru.shitandsticks.filthchat.resource" ,
				"ru.shitandsticks.filthchat.service"})
@MapperScan({"ru.shitandsticks.filthchat.mappers"})
@EnableSwagger2
@EnableScheduling
@EnableWebSocketMessageBroker
public class FilthchatApplication  implements WebSocketMessageBrokerConfigurer  {

	private static final Logger log = LoggerFactory.getLogger(FilthchatApplication.class);

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(FilthchatApplication.class, args);
	}

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		log.info("WebSocket is initialized");
		registry.addEndpoint("/ws").withSockJS();
	}
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		//В первой строке мы говорим, что сообщения, чей адрес (куда отправлены) начинается с  “/app“, должны быть направлены в методы, занимающиеся обработкой сообщений.
		registry.setApplicationDestinationPrefixes("/app");
		//Во второй строке мы говорим, что  сообщения, чей адрес начинается с  “/topic“, должны быть направлены в брокер сообщений. Брокер перенаправляет сообщения всем клиентам, подписанным на тему.
		registry.enableSimpleBroker("/topic");
	}

}
