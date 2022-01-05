package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemotest;

import com.tsi.kahtan.abubakr.cocktaildemo.cocktailDb.Equipment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EquipmentTest {
    Equipment testEquipment = new Equipment("name");
    Equipment testEquipment2 = new Equipment();

    @Test
    public void testEquipment(){
        Assertions.assertEquals("name", testEquipment.getEquipment_name(),"name not initialised");

        testEquipment2.setEquipment_name("testName");
        Assertions.assertEquals("testName",testEquipment2.getEquipment_name(),"Set Name Doesn't Work");
        Assertions.assertEquals("{\"equipment_name\"= \"testName\"}",testEquipment2.toString() ,"to String Method Displays Wrong");
        Assertions.assertEquals(0,testEquipment2.getEquipment_id(),"It Detects other Elements");
    }
}
