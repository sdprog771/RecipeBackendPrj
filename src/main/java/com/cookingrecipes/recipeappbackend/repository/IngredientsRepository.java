package com.cookingrecipes.recipeappbackend.repository;

import com.cookingrecipes.recipeappbackend.domain.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientsRepository extends JpaRepository<Ingredients,Long> {
}
