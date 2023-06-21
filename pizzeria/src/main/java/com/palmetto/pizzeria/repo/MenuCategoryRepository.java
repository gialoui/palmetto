package com.palmetto.pizzeria.repo;

import com.palmetto.pizzeria.entity.MenuCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author khangndd
 */
@Repository
public interface MenuCategoryRepository extends JpaRepository<MenuCategoryEntity, Integer> {
}
