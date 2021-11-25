package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Garnish {

    private List<Garnish> garnishList = new ArrayList<>();
    private int garnishID;
    private String garnishName;

    public Garnish(int garnishID, String garnishName){
        this.garnishID = garnishID;
        this.garnishName = garnishName;
    }

    public void populatingIngredientList(){
        this.garnishList.add(new Garnish(0, "Garnish NAME"));
    }
    public List<Garnish> getGarnishList(){
        return this.garnishList;
    }
    public String toString(){
        String json = new Gson().toJson(garnishList);
        return json;
    }

}
