package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

public class Glass {

    private int glassID;
    private String glassName;

    public Glass(int glassID, String glassName){
        this.glassID = glassID;
        this.glassName = glassName;
    }

    @Override
    public String toString(){
        return "{" +
                "\"name\"= \"" + glassName +
                "\"}";
    }
}
