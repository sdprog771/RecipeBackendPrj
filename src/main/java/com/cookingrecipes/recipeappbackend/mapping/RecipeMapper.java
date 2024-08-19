package com.cookingrecipes.recipeappbackend.mapping;

import com.cookingrecipes.recipeappbackend.domain.Recipe;
import com.cookingrecipes.recipeappbackend.web.dto.RecipeDTO;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.web.bind.annotation.Mapping;

@Mapper(componentModel="spring")
public interface RecipeMapper {


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    default void updateRecipeFromDTO(RecipeDTO recipeDTO, @MappingTarget Recipe entity) {


    }
}
