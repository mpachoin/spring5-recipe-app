package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.dtos.RecipeDto;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeDto saveRecipeDto(RecipeDto command);
}
