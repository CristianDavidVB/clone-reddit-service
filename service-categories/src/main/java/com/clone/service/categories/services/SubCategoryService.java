package com.clone.service.categories.services;

import com.clone.service.categories.dtos.CategoryDTO;
import com.clone.service.categories.dtos.SubCategoryDTO;

import java.util.List;

public interface SubCategoryService {
    List<SubCategoryDTO> findAll();
    SubCategoryDTO findById(Long id);

    SubCategoryDTO create(SubCategoryDTO subCategoryDTO);

    SubCategoryDTO update(Long id, SubCategoryDTO subCategoryDTO);

    void delete(Long id);
}
