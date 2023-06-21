package com.palmetto.pizzeria.service;

import com.palmetto.pizzeria.dto.MenuItemDto;
import com.palmetto.pizzeria.mapper.MenuItemMapper;
import com.palmetto.pizzeria.repo.MenuItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author khangndd
 */
@Service
@RequiredArgsConstructor
public class MenuItemService {
    private final MenuItemRepository repository;

    private final MenuItemMapper mapper;

    public List<MenuItemDto> findAllByCategoryId(int categoryId) {
        return mapper.toDtoList(repository.findByCategoryId(categoryId));
    }
}
