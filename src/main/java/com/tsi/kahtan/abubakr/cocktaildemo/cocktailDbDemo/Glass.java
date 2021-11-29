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

    public int getGlassID() {
        return glassID;
    }

    public void setGlassID(int glassID) {
        this.glassID = glassID;
    }

    public String getGlassName() {
        return glassName;
    }

    public void setGlassName(String glassName) {
        this.glassName = glassName;
    }
}
