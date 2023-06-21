package com.palmetto.pizzeria.controller;

import com.palmetto.pizzeria.dto.MenuCategoryDto;
import com.palmetto.pizzeria.dto.MenuItemDto;
import com.palmetto.pizzeria.service.MenuCategoryService;
import com.palmetto.pizzeria.service.MenuItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author khangndd
 */
@RestController
@RequestMapping("/menu-categories")
@RequiredArgsConstructor
public class MenuCategoryController {
    private final MenuCategoryService service;

    private final MenuItemService itemService;

    @GetMapping
    public ResponseEntity<List<MenuCategoryDto>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}/items")
    public ResponseEntity<List<MenuItemDto>> findAllItemsByCategoryId(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(itemService.findAllByCategoryId(id), HttpStatus.OK);
    }
}
