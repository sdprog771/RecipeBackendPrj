package com.cookingrecipes.recipeappbackend.service;

import com.cookingrecipes.recipeappbackend.domain.Recipe;
import com.cookingrecipes.recipeappbackend.mapping.RecipeMapper;
import com.cookingrecipes.recipeappbackend.mapping.WebDTOMappingService;
import com.cookingrecipes.recipeappbackend.repository.RecipeRepository;
import com.cookingrecipes.recipeappbackend.web.dto.RecipeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class RecipeService implements RecipeMapper{

    private final RecipeRepository recipeRepository;
    private final WebDTOMappingService webDTOMappingService;

    RecipeMapper mapper;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository, WebDTOMappingService webDTOMappingService) {
        this.recipeRepository = recipeRepository;
        this.webDTOMappingService = webDTOMappingService;
    }

    public Recipe getRecipe(Long id) {
        return recipeRepository.findById(id).orElse(null);
    }//na min petaksoume exception? petaei to orElse?

    public RecipeDTO createRecipe(RecipeDTO recipeDTO) {
        Recipe recipe = webDTOMappingService.toRecipe(recipeDTO);
        final Recipe r = recipeRepository.save(recipe);
        return webDTOMappingService.toRecipeDTO(r);//edw giati theloume na gurnaei dto objectaki? to giati oxi void?
    }

    public void deleteRecipe(Long id) {
        recipeRepository.deleteById(id);
    }

    public Recipe save(Recipe recipe){
        recipeRepository.save(recipe);
       return recipe;
    }


}
