package com.palmetto.pizzeria.dto;

import lombok.Data;

/**
 * @author khangndd
 */
@Data
public class MenuItemDto {
    private Integer id;
    private String name;
    private String categoryId;
    private Double price;
}
