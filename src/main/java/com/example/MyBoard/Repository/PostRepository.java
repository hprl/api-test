package com.example.MyBoard.Repository;

import com.example.MyBoard.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
