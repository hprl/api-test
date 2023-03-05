package com.example.MyBoard.Service;

import com.example.MyBoard.DTO.RequestWriterJoinDTO;
import com.example.MyBoard.Entity.Writer;
import com.example.MyBoard.Repository.WriterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WriterService {

    private final WriterRepository writerRepository;

    public Writer findWriter(Long id) {
        return writerRepository.findById(id).get();
    }
    public Long join(RequestWriterJoinDTO requestWriterJoinDTO){
        int age = requestWriterJoinDTO.getAge();
        String name = requestWriterJoinDTO.getName();

        Writer writer = new Writer(name, age);
        Writer savedWriter = writerRepository.save(writer);

        return savedWriter.getId();
    }
}
