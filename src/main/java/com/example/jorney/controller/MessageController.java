package com.example.jorney.controller;

import com.example.jorney.DTO.MessageDTO;
import com.example.jorney.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/message")
@CrossOrigin
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("post")
    public MessageDTO saveMessage(@RequestBody MessageDTO messageDTO){
        return messageService.saveMessage(messageDTO);
    }

    @GetMapping("get")
    public List<MessageDTO> getMessage(){
        return messageService.getAllMessage();
    }


}
