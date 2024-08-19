package com.cookingrecipes.recipeappbackend.web.dto;

public class NutritionDTO {

    private long id; //foreign key

    private String value;

    public NutritionDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
