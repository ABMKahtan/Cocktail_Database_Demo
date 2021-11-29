package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

public class Ingredient {
    private int ingredientID;
    private String ingredientName;

    public Ingredient(int ingredientID, String ingredientName){
        this.ingredientID = ingredientID;
        this.ingredientName = ingredientName;
    }

    @Override
    public String toString(){
        return "{" +
                "\"name\"= \"" + ingredientName +
                "\"}";
    }
}
