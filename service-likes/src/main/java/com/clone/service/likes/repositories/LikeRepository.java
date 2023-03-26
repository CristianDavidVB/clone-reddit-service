package com.clone.service.likes.repositories;

import com.clone.service.likes.models.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
