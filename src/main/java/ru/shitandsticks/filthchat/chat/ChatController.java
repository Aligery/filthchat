package ru.shitandsticks.filthchat.chat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import ru.shitandsticks.filthchat.configuration.HttpHandshakeInterceptor;
import ru.shitandsticks.filthchat.data.ChatMessage;

@Controller
public class ChatController {

    private static final Logger log = LoggerFactory.getLogger(ChatController.class);

    @MessageMapping("/chat/sendMessage") //publish
    @SendTo("/topic/publicChatRoom")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
        log.info(chatMessage.toString());
        return chatMessage;
    }

    @MessageMapping("/chat/addUser") //subscribing
    @SendTo("/topic/publicChatRoom")
    public ChatMessage addUser(@Payload ChatMessage chatMessage,
                               SimpMessageHeaderAccessor headerAccessor) {
        log.info(chatMessage.toString());
        // Add username in web socket session
        headerAccessor.getSessionAttributes().put("login", chatMessage.getLogin());
        return chatMessage;
    }

}
