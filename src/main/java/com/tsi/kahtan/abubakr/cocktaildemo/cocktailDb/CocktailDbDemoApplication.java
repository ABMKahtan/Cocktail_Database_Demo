package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/CocktailsDB")
public class CocktailDbDemoApplication {

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
    @Autowired
    private InstructionRepository instructionRepository;
    private String saved = "Saved";


    public CocktailDbDemoApplication(CocktailRepository cocktailRepository, EquipmentRepository equipmentRepository, GarnishRepository garnishRepository, GlassRepository glassRepository, IngredientRepository ingredientRepository, InstructionRepository instructionRepository) {
        this.cocktailRepository = cocktailRepository;
        this.equipmentRepository = equipmentRepository;
        this.garnishRepository = garnishRepository;
        this.glassRepository = glassRepository;
        this.ingredientRepository = ingredientRepository;
        this.instructionRepository = instructionRepository;
    }

    public static void main(String[] args) {
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
        return saved;
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
        return saved;
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
        return saved;
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
        return saved;
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
        return saved;
    }

    //MAKE INSTRUCTION REPO MAPPINGS
}