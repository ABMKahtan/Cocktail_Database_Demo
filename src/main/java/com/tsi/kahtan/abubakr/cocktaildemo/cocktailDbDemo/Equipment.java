package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipment {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int equipment_id;

    private String equipment_name;
    
    public Equipment(String equipment_name){
        this.equipment_name = equipment_name;
    }

    public Equipment(){

    }
    @Override
    public String toString(){
        return "{" +
                "\"equipment_name\"= \"" + equipment_name +
                "\"}";
    }

    public String getEquipment_name() {
        return equipment_name;
    }

    public void setEquipment_name(String equipment_name) {
        this.equipment_name = equipment_name;
    }
}