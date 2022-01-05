package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int ingredient_id;

    private String ingredient_name;

    public Ingredient(String ingredient_name){
        this.ingredient_name = ingredient_name;
    }
    public Ingredient(){

    }

    @Override
    public String toString(){
        return "{" +
                "\"Ingredient\"= \"" + ingredient_name +
                "\"}";
    }

    public String getIngredient_name() {
        return ingredient_name;
    }

    public int getIngredient_id() {
        return ingredient_id;
    }

    public void setIngredient_name(String ingredient_name) {
        this.ingredient_name = ingredient_name;
    }
}
