package com.cookingrecipes.recipeappbackend.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.*;

@Entity()
@Table(name = "RECIPE")
@SequenceGenerator(name = "recipe_seq", sequenceName = "myRecipe", initialValue = 1)
public class Recipe {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "myRecipe")
    private long id;

    @Column(name = "TITLE")
    private String title;
    //cuisine
    @Column(name = "CUISINE")
    private String cuisine;

    @Column(name = "CATEGORY")
    private String category;

    //preraration time (int)
    @Column(name = "PREPARATION_TIME")
    private String preparationTime;

    //cooking time (int)
    @Column(name = "COOKING_TIME")
    private String cookingTime;

    //Source (string)
    @Column(name = "SOURCE")
    private String source;

    //Nutrition value --connection with other table
    @OneToMany(mappedBy = "recipe", cascade=CascadeType.ALL)
    private List<Nutrition> nutritionList;


    //Description
    @Column(name = "DESCRIPTION")
    @Size(min=10, max=2000, message="min 10 chars")
    private String description;

    //Ingredients --connection with other table
    @OneToMany(mappedBy = "recipe", cascade=CascadeType.ALL)
    private List<Ingredients> ingredientsList;

    //Cooking tools --connection with other table
    @OneToMany(mappedBy = "recipe", cascade=CascadeType.ALL)
    private List<CookingTools> cookingToolsList;

    //Image () !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
//    @Column(name = "IMAGE")
//    private String image;

    public Recipe() {
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<Nutrition> getNutritionList() {
        return nutritionList;
    }

    public void setNutritionList(List<Nutrition> nutritionList) {
        this.nutritionList = nutritionList;
    }

    public List<Ingredients> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List<Ingredients> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }

    public List<CookingTools> getCookingToolsList() {
        return cookingToolsList;
    }

    public void setCookingToolsList(List<CookingTools> cookingToolsList) {
        this.cookingToolsList = cookingToolsList;
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
}
