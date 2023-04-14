package com.clone.service.posts.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "posts")
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class Post {
    @Id
    private String id;
    private String title;
    private String description;
    @Field("sub_category_id")
    private Long subCategoryId;
    @Transient
    List<File> files;
}
