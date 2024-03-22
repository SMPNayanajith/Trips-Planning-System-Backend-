package com.example.jorney.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MessageDTO {

    private long id;
    private String name;
    private String email;
    private String subject;
    private String message;

}
