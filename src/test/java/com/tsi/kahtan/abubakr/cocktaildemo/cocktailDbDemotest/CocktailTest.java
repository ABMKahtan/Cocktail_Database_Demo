package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemotest;

import com.tsi.kahtan.abubakr.cocktaildemo.cocktailDb.Cocktail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CocktailTest {
    Cocktail testCocktail = new Cocktail();

    @Test
    public void testCocktail(){
        testCocktail.setCocktail_name("testCName");
        Assertions.assertEquals("testCName",testCocktail.getCocktail_name(),"Name Does not Exist");
        testCocktail.setCocktail_description("testDescription");
        Assertions.assertEquals("testDescription", testCocktail.getCocktail_description() ,"Description is wrong");
        Assertions.assertEquals("{\"name\"= \"testCName\", \"Description\"=\"testDescription\"}", testCocktail.toString(),"String isn't what is expected");
        Assertions.assertEquals(0, testCocktail.getCocktail_id(), "Generated Id detects other things");
    }
}