package com.fitbite.entity;
import jakarta.persistence.*; import lombok.*;
@Entity @Table(name="recipe_ingredients") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class RecipeIngredient { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(fetch=FetchType.LAZY,optional=false) @JoinColumn(name="recipe_id") private Recipe recipe; @ManyToOne(fetch=FetchType.EAGER,optional=false) @JoinColumn(name="ingredient_id") private Ingredient ingredient; @Column(nullable=false) private String quantity; }
