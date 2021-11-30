package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instruction {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int instruction_id;
    private String instruction_description;
    private int garnish_id;
    private int glass_id;

    public Instruction(int instruction_id, String instruction_description, int garnish_id, int glass_id){

        this.instruction_id = instruction_id;
        this.instruction_description = instruction_description;
        this.garnish_id = garnish_id;
        this.glass_id = glass_id;
    }
    public Instruction(){

    }

    @Override
    public String toString(){
        return "{" +
                "\"Instruction Information: \"= \"" + instruction_description +
                "\"}";
    }

}
