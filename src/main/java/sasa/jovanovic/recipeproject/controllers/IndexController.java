package sasa.jovanovic.recipeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sasa.jovanovic.recipeproject.domain.Category;
import sasa.jovanovic.recipeproject.domain.UnitOfMeasure;
import sasa.jovanovic.recipeproject.repositories.CategoryRepository;
import sasa.jovanovic.recipeproject.repositories.UnitOfMeasureRepository;
import sasa.jovanovic.recipeproject.services.RecipeService;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
