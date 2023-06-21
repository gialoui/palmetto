package com.palmetto.pizzeria.mapper;

import com.palmetto.pizzeria.dto.MenuCategoryDto;
import com.palmetto.pizzeria.entity.MenuCategoryEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author khangndd
 */
@Mapper(componentModel = "spring")
public interface MenuCategoryMapper {
    MenuCategoryDto toDto(MenuCategoryEntity entity);

    List<MenuCategoryDto> toDtoList(List<MenuCategoryEntity> entities);
}
