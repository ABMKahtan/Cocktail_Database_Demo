package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemotest;

import com.tsi.kahtan.abubakr.cocktaildemo.cocktailDb.Cocktail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CocktailTest {
    Cocktail testCocktail = new Cocktail("name","Description");
    Cocktail testCocktail2 = new Cocktail();

    @Test
    public void testCocktail(){
        Assertions.assertEquals("name", testCocktail.getCocktail_name(), "name is not initialised");
        Assertions.assertEquals("Description", testCocktail.getCocktail_description(), "Description is not initialised");

        testCocktail2.setCocktail_name("testCName");
        Assertions.assertEquals("testCName",testCocktail2.getCocktail_name(),"Name Does not Exist");
        testCocktail2.setCocktail_description("testDescription");
        Assertions.assertEquals("testDescription", testCocktail2.getCocktail_description() ,"Description is wrong");
        Assertions.assertEquals("{\"name\"= \"testCName\", \"Description\"=\"testDescription\"}", testCocktail2.toString(),"String isn't what is expected");
        Assertions.assertEquals(0, testCocktail2.getCocktail_id(), "Generated Id detects other things");
    }
}