package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Glass {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int glass_id;

    private String glass_type;

    public Glass(String glass_type){
        this.glass_type = glass_type;
    }

    @Override
    public String toString(){
        return "{" +
                "\"Type Of Glass\"= \"" + glass_type +
                "\"}";
    }
    public Glass(){

    }

    public String getGlass_type() {
        return glass_type;
    }

    public void setGlass_type(String glass_type) {
        this.glass_type = glass_type;
    }
}
