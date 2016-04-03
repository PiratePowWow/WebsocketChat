package com.theironyard.controllers;

import com.theironyard.pojos.Greeting;
import com.theironyard.pojos.HelloMessage;
import com.theironyard.services.IronMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by PiratePowWow on 4/3/16.
 */
@Controller
public class WebsocketChatController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message){
        return new Greeting("Hello, " + message.getName() + "!");
    }

}
