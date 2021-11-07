package sasa.jovanovic.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import sasa.jovanovic.recipeproject.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
