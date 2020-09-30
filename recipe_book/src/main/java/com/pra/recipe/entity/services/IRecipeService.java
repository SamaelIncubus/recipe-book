package com.pra.recipe.entity.services;

import java.util.List;

import com.pra.recipe.entity.models.Recipe;

public interface IRecipeService {
	public Recipe get(long id);

	public List<Recipe> getAll();

	public void post(Recipe recipe);

	public void put(Recipe recipe, long id);

	public void delete(long id);
}
