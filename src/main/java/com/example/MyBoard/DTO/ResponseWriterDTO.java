package com.example.MyBoard.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseWriterDTO {
    Long id;
    String name;
    Integer age;
}
