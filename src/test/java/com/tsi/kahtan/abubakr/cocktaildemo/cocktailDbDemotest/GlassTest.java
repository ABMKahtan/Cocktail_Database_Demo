package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemotest;

import com.tsi.kahtan.abubakr.cocktaildemo.cocktailDb.Glass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GlassTest {
    Glass testGlass = new Glass("type");
    Glass testGlass2 = new Glass();

    @Test
    public void testGlass(){
        Assertions.assertEquals("type",testGlass.getGlass_type(),"type isnt initialised");

        testGlass2.setGlass_type("testGlass");
        Assertions.assertEquals("testGlass" ,testGlass2.getGlass_type(),"Glass Doesn't Exist");
        Assertions.assertEquals("{\"Type Of Glass\"= \"testGlass\"}", testGlass2.toString() ,"String Is not whats expected");
        Assertions.assertEquals(0, testGlass2.getGlass_id(), "Generated Id detects other things");
    }

}
