package com.example.servingwebcontent;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.handler.ResponseStatusExceptionHandler;

@RestController
public class RecipeController {
    @Autowired
    private RecipeRepoMongodb recipeRepoMongo;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

//    //below is an API to fetch all the recipes from the database
//    @GetMapping("/recipe")
//    public Recipe recipe(@RequestParam(value = "name", defaultValue = "World") String name) {
//        /*type out more recipes so that it returns a list of recipes. Create another method called Recipes with a mapping called Recipes and return it as a list. On a UI you would fetch the list of recipes*/
//        //we have a counter that is being converted to string as we declared in Mongo
//        Recipe recipe = new Recipe();
//
//        recipe.setId(Long.toString(counter.incrementAndGet()));
//        recipe.setName("Ragu");
//        recipe.setInstructions("");
//
//        return recipe; //this is returning the recipe we created on line 26.
//
//    }
    //below is an API to fetch one recipe from the database products
    @CrossOrigin()
    @GetMapping("/recipe/{recipeId}")//in order to load/edit a SINGLE recipe you will call http://127.0.0.1:8080/recipe/?=637fbe772e26833eb41715b7 like this as this is the route we've mapped.
    public Recipe findRecipe(@PathVariable String recipeId) {
        System.out.println("recipeId: " + recipeId);
        return recipeRepoMongo.findById(recipeId).orElseGet(Recipe::new);
    }
 //this is get a list of recipes that i will put in MongoDB
    @CrossOrigin()
    @GetMapping("/recipes")
    public List<Recipe> listRecipe(){
        return recipeRepoMongo.findAll();

    }

    //below is an API to post just one recipes into the database
   @PostMapping("/recipe")
    public void createRecipe(@RequestBody Recipe recipe) {
      recipeRepoMongo.save(recipe);
  }


    @DeleteMapping("/recipe/{name}")
    public void delete (@PathVariable String Id) {
    }
}


