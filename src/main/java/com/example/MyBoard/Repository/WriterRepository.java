package com.example.MyBoard.Repository;

import com.example.MyBoard.Entity.Writer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface WriterRepository extends JpaRepository<Writer, Long> {
}
