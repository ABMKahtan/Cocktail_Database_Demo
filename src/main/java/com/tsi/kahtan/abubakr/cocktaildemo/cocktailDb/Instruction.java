package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instruction {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int instruction_id;

    private int garnish_id;
    private int glass_id;
    private String instruction_description;

    public Instruction(String instruction_description, int garnish_id, int glass_id){
        this.instruction_description = instruction_description;
        this.garnish_id = garnish_id;
        this.glass_id = glass_id;
    }
    public Instruction(){

    }

    public String getInstruction_description() {
        return instruction_description;
    }

    public void setInstruction_description(String instruction_description) {
        this.instruction_description = instruction_description;
    }

    public int getGarnish_id() {
        return garnish_id;
    }

    public void setGarnish_id(int garnish_id) {
        this.garnish_id = garnish_id;
    }

    public int getInstruction_id() {
        return instruction_id;
    }

    public int getGlass_id() {
        return glass_id;
    }

    public void setGlass_id(int glass_id) {
        this.glass_id = glass_id;
    }

    @Override
    public String toString(){
        return "{" +
                "\"Instruction Information: \"= \"" + instruction_description +
                "\"}";
    }

}
