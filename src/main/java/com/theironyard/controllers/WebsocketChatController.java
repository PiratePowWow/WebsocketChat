package com.theironyard.controllers;

import com.theironyard.pojos.Greeting;
import com.theironyard.pojos.HelloMessage;
import com.theironyard.pojos.Player;
import com.theironyard.services.IronMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

/**
 * Created by PiratePowWow on 4/3/16.
 */
@Controller
public class WebsocketChatController {

    ArrayList<Player> players = new ArrayList<Player>();

//    @SendTo("/topic/scoreboard")


    @MessageMapping("/scoreboard/{roomCode}")
    public ArrayList<Player> scoreboard(@DestinationVariable String roomCode, Player player){
        players.add(player);
        return new ArrayList<Player>(players);
    }

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message){
        return new Greeting("Hello, " + message.getName() + "!");
    }

}
