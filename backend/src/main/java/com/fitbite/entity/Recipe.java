package com.fitbite.entity;
import jakarta.persistence.*; import lombok.*; import java.time.Instant; import java.util.*;
@Entity @Table(name="recipes",indexes={@Index(name="idx_recipe_name",columnList="name"),@Index(name="idx_recipe_meal",columnList="meal_type"),@Index(name="idx_recipe_calories",columnList="calories")})
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Recipe {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(nullable=false) private String name; @Column(length=2000) private String description;
 @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="category_id") private Category category;
 private String cuisine; @Column(name="meal_type") private String mealType;
 @OneToMany(mappedBy="recipe",cascade=CascadeType.ALL,orphanRemoval=true) @Builder.Default private List<RecipeIngredient> ingredients=new ArrayList<>();
 @Column(length=4000) private String steps; private int preparationTime; private int cookingTime; private int totalTime; private int servings;
 private double calories; private double protein; private double carbohydrates; private double fat; private double fiber; private double sodium;
 private String difficulty; @Column(length=1000) private String dietaryTags; @Column(length=1000) private String healthTags; private String imageUrl; private String nutritionSource;
 @ManyToMany @JoinTable(name="recipe_health_goals",joinColumns=@JoinColumn(name="recipe_id"),inverseJoinColumns=@JoinColumn(name="health_goal_id")) @Builder.Default private Set<HealthGoal> healthGoals=new HashSet<>();
 @Column(nullable=false) @Builder.Default private Instant createdAt=Instant.now(); @Column(nullable=false) @Builder.Default private Instant updatedAt=Instant.now();
 public void addIngredient(Ingredient ingredient,String quantity){ ingredients.add(RecipeIngredient.builder().recipe(this).ingredient(ingredient).quantity(quantity).build()); }
}
