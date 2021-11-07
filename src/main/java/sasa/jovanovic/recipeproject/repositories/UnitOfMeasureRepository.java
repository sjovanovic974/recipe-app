package sasa.jovanovic.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import sasa.jovanovic.recipeproject.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
