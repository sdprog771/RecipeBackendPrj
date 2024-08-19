package com.cookingrecipes.recipeappbackend.web.dto;

public class CookingToolsDTO {

    private long id;

    private String tool;

    private String quantity;

    public CookingToolsDTO() {
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
}
