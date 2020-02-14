package guru.springframework.mappers;

import guru.springframework.domain.Ingredient;
import guru.springframework.dtos.IngredientDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IngredientMapper {

    IngredientMapper INSTANCE = Mappers.getMapper(IngredientMapper.class);

    Ingredient IngredientDtoToIngredient(IngredientDto ingredientDto);
    IngredientDto IngredientToIngredientDto(Ingredient ingredient);
}
