package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

public class Instruction {

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


}
