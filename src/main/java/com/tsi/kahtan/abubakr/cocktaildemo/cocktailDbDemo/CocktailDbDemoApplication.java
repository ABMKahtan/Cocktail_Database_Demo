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

}