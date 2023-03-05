package com.example.MyBoard.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Writer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WRITER_ID")
    private Long id;
    @Column(name = "WRITER_NAME")
    private String name;

    @Column(name = "WRITER_AGE")
    private Integer age;

    public Writer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
