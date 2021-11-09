package sasa.jovanovic.recipeproject.services;

import sasa.jovanovic.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
