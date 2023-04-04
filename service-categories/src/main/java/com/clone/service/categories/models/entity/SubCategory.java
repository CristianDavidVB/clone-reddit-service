package com.clone.service.categories.models.entity;

import com.clone.service.categories.models.Post;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "subcategories")
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    private Boolean enable;

    @Transient
    private List<Post> posts;
}
