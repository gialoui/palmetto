package com.palmetto.pizzeria.service;

import com.palmetto.pizzeria.dto.MenuCategoryDto;
import com.palmetto.pizzeria.mapper.MenuCategoryMapper;
import com.palmetto.pizzeria.repo.MenuCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author khangndd
 */
@Service
@RequiredArgsConstructor
public class MenuCategoryService {
    private final MenuCategoryRepository repository;

    private final MenuCategoryMapper mapper;

    public List<MenuCategoryDto> getAll() {
        return mapper.toDtoList(repository.findAll());
    }
}
