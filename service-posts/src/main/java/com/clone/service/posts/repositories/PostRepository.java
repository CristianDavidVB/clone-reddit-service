package com.clone.service.posts.repositories;

import com.clone.service.posts.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
