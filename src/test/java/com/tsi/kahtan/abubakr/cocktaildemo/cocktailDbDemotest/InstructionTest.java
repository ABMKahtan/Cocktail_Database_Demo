package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemotest;

import com.tsi.kahtan.abubakr.cocktaildemo.cocktailDb.Instruction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InstructionTest {
    Instruction testInstruction = new Instruction();
    @Test
    public void testInstruction(){
        testInstruction.setGlass_id(0);
        testInstruction.setGarnish_id(0);
        testInstruction.setInstruction_description("instructionStep");
        Assertions.assertEquals("instructionStep",testInstruction.getInstruction_description(),"Instruction description is not what is expected");
        Assertions.assertEquals(0, testInstruction.getGlass_id(),"glass id is not whats expected");
        Assertions.assertEquals(0, testInstruction.getGarnish_id(), "garnish id is not what is expected");
        Assertions.assertEquals(0, testInstruction.getInstruction_id(), "instruction id is not whats expected");
    }
}
