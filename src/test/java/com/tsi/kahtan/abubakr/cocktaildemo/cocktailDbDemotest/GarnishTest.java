package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemotest;

import com.tsi.kahtan.abubakr.cocktaildemo.cocktailDb.Garnish;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GarnishTest {
    Garnish testGarnish = new Garnish();

    @Test
    public void testGarnish(){
        testGarnish.setGarnish_name("testGarnish");
        Assertions.assertEquals("testGarnish",testGarnish.getGarnish_name() ,"Garnish Name Does not match");
        Assertions.assertEquals(0, testGarnish.getGarnish_id(),"It detects more than the element created");
        Assertions.assertEquals("{\"garnish_name\"= \"testGarnish\"}",testGarnish.toString(),"toString Displays unexpectedly");
    }
}
