package com.clone.service.posts.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class PostDTO {

    private String id;
    @NotNull
    @NotBlank(message = "The title is obligatory")
    private String title;

    @NotNull
    @NotBlank(message = "The description cannot be empty")
    private String description;
    private Long subCategoryId;

}
