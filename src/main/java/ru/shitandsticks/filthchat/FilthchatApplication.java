package ru.shitandsticks.filthchat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"ru.shitandsticks.filthchat.resource" ,
				"ru.shitandsticks.filthchat.service"})
@MapperScan({"ru.shitandsticks.filthchat.mappers"})
public class FilthchatApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilthchatApplication.class, args);
	}

}
