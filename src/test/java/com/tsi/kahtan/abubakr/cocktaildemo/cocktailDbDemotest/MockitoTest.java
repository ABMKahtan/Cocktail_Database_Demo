package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemotest;

import com.tsi.kahtan.abubakr.cocktaildemo.cocktailDb.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;



@ExtendWith(MockitoExtension.class)
public class MockitoTest {

    private CocktailDbDemoApplication cocktailDbDemoApplication;
    @Mock
    private CocktailRepository cocktailRepository;
    @Mock
    private EquipmentRepository equipmentRepository;
    @Mock
    private GarnishRepository garnishRepository;
    @Mock
    private GlassRepository glassRepository;
    @Mock
    private IngredientRepository ingredientRepository;
    @Mock
    private InstructionRepository instructionRepository;

    @BeforeEach
    void setUp(){
        //FIX INSTRUCTION REPO
        cocktailDbDemoApplication = new CocktailDbDemoApplication(cocktailRepository,equipmentRepository,garnishRepository,glassRepository,ingredientRepository,instructionRepository);
    }

    @Test
    public void getAllCocktails(){

        cocktailDbDemoApplication.getAllCocktails();
        verify(cocktailRepository).findAll();

    }
    @Test
    public void testAddCocktail(){

        Cocktail savedCocktail = new Cocktail("testCocktail","test Description");

        String expected = "Saved";

        String Actual = cocktailDbDemoApplication.addCocktail(savedCocktail.getCocktail_name(),savedCocktail.getCocktail_description());

        ArgumentCaptor<Cocktail> cocktailArgumentCaptor = ArgumentCaptor.forClass(Cocktail.class);

        verify(cocktailRepository).save(cocktailArgumentCaptor.capture());

        cocktailArgumentCaptor.getValue();

        Assertions.assertEquals(expected,Actual,"Not saved into the database");

    }

    @Test
    public void getAllEquipment(){

        cocktailDbDemoApplication.getAllEquipment();
        verify(equipmentRepository).findAll();
    }
    @Test
    public void getAllGarnish(){

        cocktailDbDemoApplication.getAllGarnish();
        verify(garnishRepository).findAll();
    }

}
