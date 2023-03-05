package com.example.MyBoard.Service;

import com.example.MyBoard.DTO.RequestPostSaveDTO;
import com.example.MyBoard.Entity.Post;
import com.example.MyBoard.Entity.Writer;
import com.example.MyBoard.Repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@AllArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final WriterService writerService;

    public void savePost(@RequestBody() RequestPostSaveDTO requestPostSaveDTO) {
        String title = requestPostSaveDTO.getTitle();
        String content = requestPostSaveDTO.getContent();
        Long writerId = requestPostSaveDTO.getWriterId();

        Writer writer = writerService.findWriter(writerId);
        Post newPost = new Post(title, content, writer);
        Post savedPost = postRepository.save(newPost);

        System.out.println(savedPost);
    }

    public Post findPost(Long id) {
        return postRepository.findById(id).get();
    }
}
