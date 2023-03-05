package com.example.MyBoard.Controller;

import com.example.MyBoard.DTO.ResponseWriterDTO;
import com.example.MyBoard.DTO.RequestWriterJoinDTO;
import com.example.MyBoard.Entity.Writer;
import com.example.MyBoard.Service.WriterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/writer")
@AllArgsConstructor
public class WriterController {

    private final WriterService writerService;

    @GetMapping("/find")
    public ResponseWriterDTO findUser(@RequestParam(name = "id") Long id) {
        Writer writer = writerService.findWriter(id);

        Long foundId = writer.getId();
        String foundName = writer.getName();
        int foundAge = writer.getAge();

        return new ResponseWriterDTO(foundId, foundName, foundAge);
    }

    @PostMapping("/join")
    public Long joinPost(@RequestBody RequestWriterJoinDTO requestWriterJoinDTO) {
        return writerService.join(requestWriterJoinDTO);
    }
}
