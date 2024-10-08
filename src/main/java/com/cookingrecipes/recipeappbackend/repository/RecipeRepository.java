package com.cookingrecipes.recipeappbackend.repository;

import com.cookingrecipes.recipeappbackend.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
