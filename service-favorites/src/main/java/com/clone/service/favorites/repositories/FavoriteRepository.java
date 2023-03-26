package com.clone.service.favorites.repositories;

import com.clone.service.favorites.models.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
}
