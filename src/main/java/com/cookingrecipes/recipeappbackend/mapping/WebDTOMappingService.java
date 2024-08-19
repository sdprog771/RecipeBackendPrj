package com.cookingrecipes.recipeappbackend.mapping;

import com.cookingrecipes.recipeappbackend.domain.CookingTools;
import com.cookingrecipes.recipeappbackend.domain.Ingredients;
import com.cookingrecipes.recipeappbackend.domain.Nutrition;
import com.cookingrecipes.recipeappbackend.domain.Recipe;
import com.cookingrecipes.recipeappbackend.web.dto.CookingToolsDTO;
import com.cookingrecipes.recipeappbackend.web.dto.IngredientsDTO;
import com.cookingrecipes.recipeappbackend.web.dto.NutritionDTO;
import com.cookingrecipes.recipeappbackend.web.dto.RecipeDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WebDTOMappingService {



    public RecipeDTO toRecipeDTO(Recipe recipe) {
        RecipeDTO dto = new RecipeDTO();
        dto.setId(recipe.getId());
        dto.setTitle(recipe.getTitle());
        dto.setCuisine(recipe.getCuisine());
        dto.setCategory(recipe.getCategory());
        dto.setPreparationTime(recipe.getPreparationTime());
        dto.setCookingTime(recipe.getCookingTime());
        dto.setSource(recipe.getSource());
        //foreign key
        dto.setNutritionList(recipe.getNutritionList().stream().map(this::toDTO).collect(Collectors.toList()));
        dto.setDescription(recipe.getDescription());
        //foreign key
        dto.setIngredientsList(recipe.getIngredientsList().stream().map(this::toDTO).collect(Collectors.toList()));
        //foreign key
        dto.setCookingToolsList(recipe.getCookingToolsList().stream().map(this::toDTO).collect(Collectors.toList()));

        return dto;
    }

    private NutritionDTO toDTO(Nutrition nutrition) {
        NutritionDTO dto = new NutritionDTO();
        dto.setId(nutrition.getId());
        dto.setValue(nutrition.getValue());
        return dto;
    }

    private IngredientsDTO toDTO(Ingredients ingredient) {
        IngredientsDTO dto = new IngredientsDTO();
        dto.setId(ingredient.getId());
        dto.setMaterial(ingredient.getMaterial());
        dto.setNumber(ingredient.getNumber());
        dto.setUnit(ingredient.getUnit());
        return dto;
    }

    private CookingToolsDTO toDTO(CookingTools cookingTools) {
        CookingToolsDTO dto = new CookingToolsDTO();
        dto.setId(cookingTools.getId());
        dto.setQuantity(cookingTools.getQuantity());
        dto.setTool(cookingTools.getTool());
        return dto;
    }

    public Recipe toRecipe(RecipeDTO recipeDTO) {
        Recipe recipe = new Recipe();
        recipe.setTitle(recipeDTO.getTitle());
        recipe.setCuisine(recipeDTO.getCuisine());
        recipe.setCategory(recipeDTO.getCategory());
        recipe.setPreparationTime(recipeDTO.getPreparationTime());
        recipe.setCookingTime(recipeDTO.getCookingTime());
        recipe.setSource(recipeDTO.getSource());
        //foreign key
        Nutrition n = new Nutrition();
        n.setRecipe(recipe);
        n.setValue("test");
//        recipe.setNutritionList(recipeDTO.getNutritionList());
        recipe.setNutritionList(List.of(n));
        recipe.setDescription(recipeDTO.getDescription());
        //foreign key
        Ingredients i = new Ingredients();
        i.setRecipe(recipe);
        i.setMaterial("test");
        i.setNumber("test");
//        recipe.setIngredientsList(recipeDTO.getIngredientsList());
        recipe.setIngredientsList(List.of(i));
        //foreign key
        CookingTools c = new CookingTools();
        c.setRecipe(recipe);
        c.setQuantity("test");
        c.setTool("test");
//        recipe.setCookingToolsList(recipeDTO.getCookingToolsList());
        recipe.setCookingToolsList(List.of(c));
        return recipe;
    }


    public IngredientsDTO toIngredientsDTO (Ingredients ingredient){
        IngredientsDTO ingredientDTO=new IngredientsDTO();

        return ingredientDTO;
    }

    public Ingredients toIngredients(IngredientsDTO ingredientDTO){
        Ingredients ingredient=new Ingredients();

        return ingredient;
    }

    public NutritionDTO toNutritionDTO(Nutrition nutrition){
        NutritionDTO nutritionDTO=new NutritionDTO();

        return nutritionDTO;
    }
    public Nutrition toNutrition(NutritionDTO nutritionDTO){
        Nutrition nutrition =new Nutrition();

        return nutrition;
    }

    public CookingToolsDTO toCookingToolsDTO(CookingTools cookingTools){
        CookingToolsDTO cookingTools_dto=new CookingToolsDTO();

        return cookingTools_dto;
    }
    public CookingTools toCookingTools(CookingToolsDTO cookingTools_dto){
        CookingTools cookingTools=new CookingTools();

        return cookingTools;
    }

    public void updateRecipe(Recipe recipe,RecipeDTO recipeDTO){
        recipe.setTitle(recipeDTO.getTitle());
        recipe.setCuisine(recipeDTO.getCuisine());
        recipe.setCategory(recipeDTO.getCategory());
        recipe.setPreparationTime(recipeDTO.getPreparationTime());
        recipe.setCookingTime(recipeDTO.getCookingTime());
        recipe.setSource(recipeDTO.getSource());

        Nutrition n = new Nutrition();
        n.setRecipe(recipe);
        recipe.setNutritionList(List.of(n));

        recipe.setDescription(recipeDTO.getDescription());

        Ingredients i = new Ingredients();
        i.setRecipe(recipe);
        recipe.setIngredientsList(List.of(i));

        CookingTools c = new CookingTools();
        c.setRecipe(recipe);
        recipe.setCookingToolsList(List.of(c));
    }

}
