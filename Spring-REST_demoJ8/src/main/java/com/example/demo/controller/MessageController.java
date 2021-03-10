package com.example.demo.controller;

import com.example.demo.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {


        @GetMapping("/message")
        Message send() {
            return new Message("Minha Primeira Mensagem");
        }

        @PostMapping ("/message")
        Message echo (@RequestBody Message message){
            return message;
        }


}