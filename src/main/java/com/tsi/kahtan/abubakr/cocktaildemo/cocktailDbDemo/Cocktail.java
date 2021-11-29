package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cocktail {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int id;

    private int cocktail_id;
    private String cocktail_name;
    private String cocktail_description;

    public Cocktail(int cocktailID, String cocktailName, String cocktailDescription){
        this.cocktail_id = cocktailID;
        this.cocktail_name = cocktailName;
        this.cocktail_description = cocktailDescription;
    }

    public Cocktail(){

    }

    public int getCocktail_id() {
        return cocktail_id;
    }

    public void setCocktail_id(int cocktail_id) {
        this.cocktail_id = cocktail_id;
    }

    public String getCocktail_name() {
        return cocktail_name;
    }

    public void setCocktail_name(String cocktail_name) {
        this.cocktail_name = cocktail_name;
    }

    public String getCocktail_description() {
        return cocktail_description;
    }

    public void setCocktail_description(String cocktail_description) {
        this.cocktail_description = cocktail_description;
    }
/* @Override
    public String toString() {
        return "{" +
                "\"name\"= \"" + cocktailName +
                "\", \"Description\"=\"" + cocktailDescription +
                "\"}";
    }*/
}
