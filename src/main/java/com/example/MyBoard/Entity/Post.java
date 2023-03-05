package com.example.MyBoard.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Post {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "POST_ID")
    private Long id;

    @Column(name = "POST_TITLE")
    private String title;

    @Column(name = "POST_CONTENT")
    private String content;

    @ManyToOne
    @JoinColumn(name = "WRITER_ID")
    private Writer writer;

    public Post(String title, String content, Writer writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }
}
