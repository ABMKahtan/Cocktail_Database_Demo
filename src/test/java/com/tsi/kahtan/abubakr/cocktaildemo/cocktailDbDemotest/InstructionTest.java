package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemotest;

import com.tsi.kahtan.abubakr.cocktaildemo.cocktailDb.Instruction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InstructionTest {
    Instruction testInstruction = new Instruction("name",1,1);
    Instruction testInstruction2 = new Instruction();
    @Test
    public void testInstruction(){
        Assertions.assertEquals("name",testInstruction.getInstruction_description(),"Instruction description is not initialised");
        Assertions.assertEquals(1, testInstruction.getGlass_id(),"glass id is not initialised");
        Assertions.assertEquals(1, testInstruction.getGarnish_id(), "garnish id is not initialised");

        testInstruction2.setGlass_id(0);
        testInstruction2.setGarnish_id(0);
        testInstruction2.setInstruction_description("instructionStep");
        Assertions.assertEquals("instructionStep",testInstruction2.getInstruction_description(),"Instruction description is not what is expected");
        Assertions.assertEquals(0, testInstruction2.getGlass_id(),"glass id is not whats expected");
        Assertions.assertEquals(0, testInstruction2.getGarnish_id(), "garnish id is not what is expected");
        Assertions.assertEquals(0, testInstruction2.getInstruction_id(), "instruction id is not whats expected");
        Assertions.assertEquals("{\"Instruction Information: \"= \"instructionStep\"}", testInstruction2.toString(),"toString Is not what is expected");
    }
}
