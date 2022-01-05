package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemotest;

import com.tsi.kahtan.abubakr.cocktaildemo.cocktailDb.Equipment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EquipmentTest {
    Equipment testEquipment = new Equipment();

    @Test
    public void testEquipment(){
        testEquipment.setEquipment_name("testName");
        Assertions.assertEquals("testName",testEquipment.getEquipment_name(),"Set Name Doesn't Work");
        Assertions.assertEquals("{\"equipment_name\"= \"testName\"}",testEquipment.toString() ,"to String Method Displays Wrong");
        Assertions.assertEquals(0,testEquipment.getEquipment_id(),"It Detects other Elements");
    }
}
