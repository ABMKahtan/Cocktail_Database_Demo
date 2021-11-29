package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

public class Garnish {

    private int garnishID;
    private String garnishName;

    public Garnish(int garnishID, String garnishName){
        this.garnishID = garnishID;
        this.garnishName = garnishName;
    }
    @Override
    public String toString(){
        return "{" +
                "\"name\"= \"" + garnishName +
                "\"}";
    }
}
