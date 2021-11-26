package com.tsi.kahtan.abubakr.cocktaildemo;

import com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo.CocktailInstructions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CocktailDbDemoApplication {

	@CrossOrigin("http://localhost:8080")
	@GetMapping("/Cocktail_Recipe")
	public String myResponse(){
		CocktailInstructions myCocktail = new CocktailInstructions(0,0,0);
		return myCocktail.toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(CocktailDbDemoApplication.class, args);

	}
}