package com.cookingrecipes.recipeappbackend.domain;


import jakarta.persistence.*;

@Entity
@Table(name="NUTRITION")
@SequenceGenerator(name="nutrition_seq", sequenceName = "nutrition", initialValue = 1)
public class Nutrition {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "nutrition")//sequenceName = "nutrition"
    private long id;

    @Column(name="NUTRI_VALUE")
    private String value;

    @ManyToOne()
    @JoinColumn(name="RECIPE_ID", nullable=false)
    private Recipe recipe;

    public Nutrition() {
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

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
