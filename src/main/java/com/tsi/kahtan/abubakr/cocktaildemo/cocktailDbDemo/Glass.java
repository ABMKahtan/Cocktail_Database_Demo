package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Glass {

    private List<Glass> glassList = new ArrayList<>();
    private int glassID;
    private String glassName;

    public Glass(int glassID, String glassName){
        this.glassID = glassID;
        this.glassName = glassName;
    }

    public void populatingIngredientList(){
        this.glassList.add(new Glass(0, "GLASS NAME"));
    }
    public List<Glass> getGlassList(){
        return this.glassList;
    }
    public String toString(){
        String json = new Gson().toJson(glassList);
        return json;
    }

}
