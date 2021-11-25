package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

public class Cocktail {
    private List<Cocktail> drinkList = new ArrayList<>();
    private int cocktailID;
    private String cocktailName;
    private String cocktailDescription;

    public Cocktail(int cocktailID, String cocktailName, String cocktailDescription){
        this.cocktailID = cocktailID;
        this.cocktailName = cocktailName;
        this.cocktailDescription = cocktailDescription;
    }
    public void PopulatingDrinkList(){
        this.drinkList.add(new Cocktail(0,"NAME OF DRINK", "DESCRIPTION OF DRINK"));
    }
    public List<Cocktail> getDrinkList(){
        return this.drinkList;
    }

    public String toString(){
        String json = new Gson().toJson(drinkList);
        return json;
    }
}
