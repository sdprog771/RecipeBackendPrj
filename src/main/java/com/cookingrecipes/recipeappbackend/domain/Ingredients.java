package com.cookingrecipes.recipeappbackend.domain;


import jakarta.persistence.*;

@Entity
@Table(name="INGREDIENTS")
@SequenceGenerator(name = "ingredients_seq", sequenceName = "ingredients", initialValue = 1)
public class Ingredients {


    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "ingredients")//sequenceName = "ingredients"
    private long id;

    @Column(name="MATERIAL")
    private  String material;

    @Column(name="UNIT")
    private String unit;

    @Column(name="NUMBER")
    private String number;

    @ManyToOne()
    @JoinColumn(name="RECIPE_ID")
    private Recipe recipe;

    public Ingredients() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
