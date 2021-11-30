package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Garnish {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int garnish_id;

    private String garnish_name;

    public Garnish(String garnish_name){
        this.garnish_name = garnish_name;
    }

    public Garnish(){

    }

    @Override
    public String toString(){
        return "{" +
                "\"garnish_name\"= \"" + garnish_name +
                "\"}";
    }

    public String getGarnish_name() {
        return garnish_name;
    }

    public void setGarnish_name(String garnish_name) {
        this.garnish_name = garnish_name;
    }
}
