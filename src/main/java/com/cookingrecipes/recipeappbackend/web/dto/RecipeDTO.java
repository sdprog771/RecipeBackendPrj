package com.cookingrecipes.recipeappbackend.web.dto;

import com.cookingrecipes.recipeappbackend.domain.CookingTools;
import com.cookingrecipes.recipeappbackend.domain.Ingredients;
import com.cookingrecipes.recipeappbackend.domain.Nutrition;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipeDTO {

    private Long id;

    private String title;

    private String cuisine;

    private String category;

    private String preparationTime;

    private String cookingTime;

    private String source;

    private List<NutritionDTO> nutritionList;

    private String description;

    private List<IngredientsDTO> ingredientsList;

    private List<CookingToolsDTO> cookingToolsList; //   //foreign key


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(String preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(String cookingTime) {
        this.cookingTime = cookingTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<NutritionDTO> getNutritionList() {
        return nutritionList;
    }

    public void setNutritionList(List<NutritionDTO> nutritionList) {
        this.nutritionList = nutritionList;
    }

    public List<IngredientsDTO> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List<IngredientsDTO> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }

    public List<CookingToolsDTO> getCookingToolsList() {
        return cookingToolsList;
    }

    public void setCookingToolsList(List<CookingToolsDTO> cookingToolsList) {
        this.cookingToolsList = cookingToolsList;
    }
}
