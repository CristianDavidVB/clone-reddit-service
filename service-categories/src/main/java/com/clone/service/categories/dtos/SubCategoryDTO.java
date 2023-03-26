package com.clone.service.categories.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class SubCategoryDTO {
    private Long id;
    @NotBlank(message = "Name this SubCategory is required")
    private  String name;
}
