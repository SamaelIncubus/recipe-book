package com.pra.recipe.entity.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pra.recipe.entity.models.Recipe;
import com.pra.recipe.entity.services.IRecipeService;

@RestController
public class RecipeController {

	@Autowired
	IRecipeService recipeService;
	
	@GetMapping("/recipes")
	public List<Recipe> getAllRecipes(){
		return recipeService.getAll();
	}
	
	@GetMapping("/recipes/{id}")
	public Recipe getOne (@PathVariable(value = "id") long id) {
		return recipeService.get(id);
	}
	
	@PostMapping("/recipe")
	public void add(Recipe recipe) {
		recipeService.post(recipe);
	}
	
	@PutMapping("/recipe")
	public void update (Recipe recipe, long id) {
		recipeService.put(recipe, id);
	}
	
	@DeleteMapping("/recipe/{id}")
	public void delete (@PathVariable(value = "id") int id) {
		recipeService.delete(id);
	}
}
 