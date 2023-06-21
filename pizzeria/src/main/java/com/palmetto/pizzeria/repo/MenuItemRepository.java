package com.palmetto.pizzeria.repo;

import com.palmetto.pizzeria.entity.MenuItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author khangndd
 */
@Repository
public interface MenuItemRepository extends JpaRepository<MenuItemEntity, Integer> {
}
