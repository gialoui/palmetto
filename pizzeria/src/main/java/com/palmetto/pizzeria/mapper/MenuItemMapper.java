package com.palmetto.pizzeria.mapper;

import com.palmetto.pizzeria.dto.MenuItemDto;
import com.palmetto.pizzeria.entity.MenuItemEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author khangndd
 */
@Mapper(componentModel = "spring")
public interface MenuItemMapper {
    MenuItemDto toDto(MenuItemEntity entity);

    List<MenuItemDto> toDtoList(List<MenuItemEntity> entities);
}
