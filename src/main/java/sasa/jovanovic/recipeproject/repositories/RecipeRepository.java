package sasa.jovanovic.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import sasa.jovanovic.recipeproject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
