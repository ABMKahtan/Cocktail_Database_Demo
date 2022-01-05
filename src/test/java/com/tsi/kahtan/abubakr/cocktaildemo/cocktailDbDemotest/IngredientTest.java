package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemotest;

import com.tsi.kahtan.abubakr.cocktaildemo.cocktailDb.Ingredient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IngredientTest {
    Ingredient testIngredient = new Ingredient("name");
    Ingredient testIngredient2 = new Ingredient();


    @Test
    public void testIngredient(){
        Assertions.assertEquals("name",testIngredient.getIngredient_name(),"Name isnt initialised ");

        testIngredient2.setIngredient_name("testIngredient");
        Assertions.assertEquals("testIngredient", testIngredient2.getIngredient_name(),"name is not what is expected");
        Assertions.assertEquals(0,testIngredient2.getIngredient_id(),"id is not what is expected for the test");
        Assertions.assertEquals("{\"Ingredient\"= \"testIngredient\"}",testIngredient2.toString(),"toString doesnt display as expected");
    }

}
