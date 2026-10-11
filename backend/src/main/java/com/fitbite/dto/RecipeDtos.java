package com.fitbite.dto;
import jakarta.validation.constraints.*; import java.util.*;
public final class RecipeDtos { private RecipeDtos(){}
 public record IngredientInput(@NotBlank String name,@NotBlank String quantity){}
 public record RecipeRequest(@NotBlank String name,@Size(max=2000) String description,@NotBlank String category,@NotBlank String cuisine,@NotBlank String mealType,@NotEmpty List<IngredientInput> ingredients,@NotBlank String steps,@Min(0) int preparationTime,@Min(0) int cookingTime,@Min(1) int servings,@PositiveOrZero double calories,@PositiveOrZero double protein,@PositiveOrZero double carbohydrates,@PositiveOrZero double fat,@PositiveOrZero double fiber,@PositiveOrZero double sodium,String difficulty,String dietaryTags,String healthTags,String imageUrl,String nutritionSource,List<String> healthGoals){}
 public record RecipeSummary(Long id,String name,String description,String category,String cuisine,String mealType,double calories,double protein,double carbohydrates,double fat,double fiber,double sodium,int totalTime,int servings,String difficulty,String dietaryTags,String healthTags,String imageUrl,boolean favorite){}
 public record RecipeDetail(Long id,String name,String description,String category,String cuisine,String mealType,List<IngredientView> ingredients,String steps,int preparationTime,int cookingTime,int totalTime,int servings,double calories,double protein,double carbohydrates,double fat,double fiber,double sodium,String difficulty,String dietaryTags,String healthTags,String imageUrl,String nutritionSource,List<String> healthGoals,boolean favorite){}
 public record IngredientView(String name,String quantity){}
}
