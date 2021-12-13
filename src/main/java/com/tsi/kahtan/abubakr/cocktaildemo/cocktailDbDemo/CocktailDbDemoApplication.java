package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/CocktailsDB")
public class CocktailDbDemoApplication {
    private static SecretGetter secretDB = new SecretGetter();

    @Autowired
    private CocktailRepository cocktailRepository;
    @Autowired
    private EquipmentRepository equipmentRepository;
    @Autowired
    private GarnishRepository garnishRepository;
    @Autowired
    private GlassRepository glassRepository;
    @Autowired
    private IngredientRepository ingredientRepository;

    public static void main(String[] args) {
        secretDB.getSecret();
        SpringApplication.run(CocktailDbDemoApplication.class, args);

    }
    @GetMapping("/allCocktails")
    public @ResponseBody
    Iterable<Cocktail> getAllCocktails() {
        return cocktailRepository.findAll();
    }

    @PostMapping("/addCocktail")
    public @ResponseBody String addCocktail(@RequestParam String cocktail_name, String cocktailDescription ){

        Cocktail addCocktail = new Cocktail(cocktail_name,cocktailDescription);
        cocktailRepository.save(addCocktail);
        return "Saved";
    }
    @GetMapping("/allEquipment")
    public @ResponseBody
    Iterable<Equipment> getAllEquipment() {
        return equipmentRepository.findAll();
    }

    @PostMapping("/addEquipment")
    public @ResponseBody String addEquipment(@RequestParam String equipment_name){
        Equipment addEquipment = new Equipment(equipment_name);
        equipmentRepository.save(addEquipment);
        return "Saved";
    }
    @GetMapping("/allGarnish")
    public @ResponseBody
    Iterable<Garnish> getAllGarnish() {
        return garnishRepository.findAll();
    }

    @PostMapping("/addGarnish")
    public @ResponseBody String addGarnish(@RequestParam String garnish_name){
        Garnish addGarnish = new Garnish(garnish_name);
        garnishRepository.save(addGarnish);
        return "Saved";
    }

    @GetMapping("/allGlass")
    public @ResponseBody
    Iterable<Glass> getAllGlass() {
        return glassRepository.findAll();
    }

    @PostMapping("/addGlass")
    public @ResponseBody String addGlass(@RequestParam String glass_type){
        Glass addGlass = new Glass(glass_type);
        glassRepository.save(addGlass);
        return "Saved";
    }
    @GetMapping("/allIngredients")
    public @ResponseBody
    Iterable<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    @PostMapping("/addIngredient")
    public @ResponseBody String addIngredient(@RequestParam String ingredient_name){
        Ingredient addIngredient = new Ingredient(ingredient_name);
        ingredientRepository.save(addIngredient);
        return "Saved";
    }

}