package com.example.jorney.service;

import com.example.jorney.DTO.MessageDTO;
import com.example.jorney.entity.Message;
import com.example.jorney.repo.MessageRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MessageService {


    @Autowired
    private MessageRepo messageRepo;

    @Autowired
    private ModelMapper modelMapper;


    public MessageDTO saveMessage(MessageDTO messageDTO) {
        messageRepo.save(modelMapper.map(messageDTO, Message.class));
        return messageDTO;


    }

    public List<MessageDTO> getAllMessage(){
        List<Message>messageList=messageRepo.findAll();
        return modelMapper.map(messageList,new TypeToken<List<MessageDTO>>(){}.getType());
    }
}
