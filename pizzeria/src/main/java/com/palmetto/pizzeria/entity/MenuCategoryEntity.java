package com.palmetto.pizzeria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author khangndd
 */
@Table(name = "menu_categories")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuCategoryEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

//    @OneToMany(mappedBy = "category")
//    private Set<MenuItemEntity> items;
}
