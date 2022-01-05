package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemotest;

import com.tsi.kahtan.abubakr.cocktaildemo.cocktailDb.Ingredient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IngredientTest {
    Ingredient testIngredient = new Ingredient("name");

    @Test
    public void testIngredient(){
        Assertions.assertEquals("name",testIngredient.getIngredient_name(),"Name isnt initialised ");
        testIngredient.setIngredient_name("testIngredient");
        Assertions.assertEquals("testIngredient", testIngredient.getIngredient_name(),"name is not what is expected");
        Assertions.assertEquals(0,testIngredient.getIngredient_id(),"id is not what is expected for the test");
        Assertions.assertEquals("{\"Ingredient\"= \"testIngredient\"}",testIngredient.toString(),"toString doesnt display as expected");
    }

}
