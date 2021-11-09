package sasa.jovanovic.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import sasa.jovanovic.recipeproject.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
