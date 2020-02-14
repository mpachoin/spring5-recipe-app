package guru.springframework.mappers;

import guru.springframework.domain.Recipe;
import guru.springframework.dtos.RecipeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecipeMapper {

    RecipeMapper INSTANCE = Mappers.getMapper(RecipeMapper.class);

    RecipeDto RecipeToRecipeDto(Recipe recipe);
    Recipe RecipeDtoToRecipe(RecipeDto recipeDto);

}
