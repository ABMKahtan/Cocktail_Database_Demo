package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

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

}