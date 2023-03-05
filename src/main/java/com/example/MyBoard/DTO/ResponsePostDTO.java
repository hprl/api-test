package com.example.MyBoard.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponsePostDTO {
    Long id;
    String title;
    String content;
    ResponseWriterDTO writer;
}
