package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemotest;

import com.tsi.kahtan.abubakr.cocktaildemo.cocktailDb.Garnish;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GarnishTest {
    Garnish testGarnish = new Garnish("name");
    Garnish testGarnish2 = new Garnish();

    @Test
    public void testGarnish(){
        Assertions.assertEquals("name",testGarnish.getGarnish_name(),"name is not initialised");

        testGarnish2.setGarnish_name("testGarnish");
        Assertions.assertEquals("testGarnish",testGarnish2.getGarnish_name() ,"Garnish Name Does not match");
        Assertions.assertEquals(0, testGarnish2.getGarnish_id(),"It detects more than the element created");
        Assertions.assertEquals("{\"garnish_name\"= \"testGarnish\"}",testGarnish2.toString(),"toString Displays unexpectedly");
    }
}
