package com.clone.service.posts.repositories;

import com.clone.service.posts.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {
    @Query("{sub_category_id:?0}")
    List<Post> findBySubCategoryId(Long subCategoryId);
}
