package com.cookingrecipes.recipeappbackend.domain;


import jakarta.persistence.*;

@Entity
@Table(name="COOKING_TOOLS")
@SequenceGenerator(name="cooking_tools_seq", sequenceName = "cooking_tools", initialValue = 1)
public class CookingTools {


    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "cooking_tools")//sequenceName = "cooking_tools"
    private long id;

    @Column(name="TOOL")
    private  String tool;

    @Column(name="QUANTITY")
    private String quantity;

    @ManyToOne()
    @JoinColumn(name="RECIPE_ID")
    private Recipe recipe;


    public CookingTools() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }


}
