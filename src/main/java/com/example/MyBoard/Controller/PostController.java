package com.example.MyBoard.Controller;

import com.example.MyBoard.DTO.RequestPostSaveDTO;
import com.example.MyBoard.DTO.ResponsePostDTO;
import com.example.MyBoard.DTO.ResponseWriterDTO;
import com.example.MyBoard.Entity.Post;
import com.example.MyBoard.Entity.Writer;
import com.example.MyBoard.Service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/post")
@AllArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/find")
    public ResponsePostDTO findPost(@RequestParam(name = "id") Long id) {
        Post post = postService.findPost(id);

        Long foundId = post.getId();
        String foundTitle = post.getTitle();
        String foundContent = post.getContent();

        Writer foundWriter = post.getWriter();
        ResponseWriterDTO writerDTO = new ResponseWriterDTO(foundWriter.getId(), foundWriter.getName(), foundWriter.getAge());

        return new ResponsePostDTO(foundId, foundTitle, foundContent, writerDTO);
    }

    @PostMapping("/save")
    public void savePost(@RequestBody() RequestPostSaveDTO requestPostSaveDTO) {
        postService.savePost(requestPostSaveDTO);
    }

}
