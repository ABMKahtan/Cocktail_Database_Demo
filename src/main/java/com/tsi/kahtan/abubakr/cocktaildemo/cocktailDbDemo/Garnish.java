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

    public int getGarnishID() {
        return garnishID;
    }

    public void setGarnishID(int garnishID) {
        this.garnishID = garnishID;
    }

    public String getGarnishName() {
        return garnishName;
    }

    public void setGarnishName(String garnishName) {
        this.garnishName = garnishName;
    }
}
