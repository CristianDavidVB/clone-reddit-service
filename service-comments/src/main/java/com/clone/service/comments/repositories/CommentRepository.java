package com.clone.service.comments.repositories;

import com.clone.service.comments.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
