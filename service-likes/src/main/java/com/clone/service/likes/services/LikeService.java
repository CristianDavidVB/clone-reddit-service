package com.clone.service.likes.services;

import com.clone.service.likes.dtos.LikeDTO;

import java.util.List;

public interface LikeService {
    List<LikeDTO>findAll();
    LikeDTO findById(Long id);

    LikeDTO create(LikeDTO likeDTO);

    LikeDTO update(Long id, LikeDTO likeDTO);

    void delete(Long id);
}
