package com.clone.service.favorites.services;

import com.clone.service.favorites.dtos.FavoriteDTO;

import java.util.List;

public interface FavoriteService {
    List<FavoriteDTO> findAll();
    FavoriteDTO findById(Long id);

    FavoriteDTO create(FavoriteDTO favoriteDTO);

    FavoriteDTO update(Long id, FavoriteDTO favoriteDTO);

    void delete(Long id);
}
