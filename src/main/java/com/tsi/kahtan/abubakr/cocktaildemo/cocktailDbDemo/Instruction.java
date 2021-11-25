package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Instruction {

    private List<Instruction> instructionList = new ArrayList<>();
    private int instructionID;
    private String instructionDescription;
    private int garnishID;
    private int glassID;

    public Instruction(int instructionID, String instructionDescription, int garnishID, int glassID){
        this.instructionID = instructionID;
        this.instructionDescription = instructionDescription;
        this.garnishID = garnishID;
        this.glassID = glassID;
    }

    public void populatingIngredientList(){
        this.instructionList.add(new Instruction(0, "INSTRUCTION DESCRIPTION",0, 0));
    }
    public List<Instruction> getInstructionList(){
        return this.instructionList;
    }
    public String toString(){
        String json = new Gson().toJson(instructionList);
        return json;
    }

}
