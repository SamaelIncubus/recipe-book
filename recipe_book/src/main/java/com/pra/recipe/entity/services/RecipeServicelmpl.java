package com.pra.recipe.entity.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pra.recipe.entity.dao.IRecipeDao;
import com.pra.recipe.entity.models.Recipe;

@Service
public class RecipeServicelmpl implements IRecipeService {

	@Autowired
	private IRecipeDao recipeDao;

	@Override
	public Recipe get(long id) {
		return recipeDao.findById(id).get();
	}

	@Override
	public List<Recipe> getAll() {
		return (List<Recipe>) recipeDao.findAll();
	}

	@Override
	public void post(Recipe recipe) {
		recipeDao.save(recipe);

	}

	@Override
	public void put(Recipe recipe, long id) {
		recipeDao.findById(id).ifPresent((x) -> {
			recipe.setId(id);
			recipeDao.save(recipe);
		});

	}

	@Override
	public void delete(long id) {
		recipeDao.deleteById(id);
	}

}
