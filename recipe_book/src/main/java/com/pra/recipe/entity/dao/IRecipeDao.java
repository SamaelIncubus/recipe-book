package com.pra.recipe.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.pra.recipe.entity.models.Recipe;

public interface IRecipeDao extends CrudRepository<Recipe, Long> {

}
