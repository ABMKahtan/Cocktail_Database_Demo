package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

public class Ingredient {
    private List<Ingredient> ingredientList = new ArrayList<>();
    private int ingredientID;
    private String ingredientName;

    public Ingredient(int ingredientID, String ingredientName){
        this.ingredientID = ingredientID;
        this.ingredientName = ingredientName;
    }

    public void populatingIngredientList(){
        this.ingredientList.add(new Ingredient(0, "INGREDIENT NAME"));
    }
    public List<Ingredient> getIngredientList(){
        return this.ingredientList;
    }
    public String toString(){
        String json = new Gson().toJson(ingredientList);
        return json;
    }

}
