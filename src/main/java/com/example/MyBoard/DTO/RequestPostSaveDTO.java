package com.example.MyBoard.DTO;

import lombok.Data;

@Data
public class RequestPostSaveDTO {
    String title;
    String content;
    Long writerId;
}
