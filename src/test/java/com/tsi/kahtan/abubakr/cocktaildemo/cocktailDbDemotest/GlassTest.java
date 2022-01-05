package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemotest;

import com.tsi.kahtan.abubakr.cocktaildemo.cocktailDb.Glass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GlassTest {
    Glass testGlass = new Glass("type");

    @Test
    public void testGlass(){
        Assertions.assertEquals("type",testGlass.getGlass_type(),"type isnt initialised");
        testGlass.setGlass_type("testGlass");
        Assertions.assertEquals("testGlass" ,testGlass.getGlass_type(),"Glass Doesn't Exist");
        Assertions.assertEquals("{\"Type Of Glass\"= \"testGlass\"}", testGlass.toString() ,"String Is not whats expected");
        Assertions.assertEquals(0, testGlass.getGlass_id(), "Generated Id detects other things");
    }

}
