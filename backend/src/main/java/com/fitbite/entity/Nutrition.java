package com.fitbite.entity;
import jakarta.persistence.*; import lombok.*;
@Entity @Table(name="nutrition") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Nutrition { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @OneToOne @JoinColumn(name="recipe_id",unique=true,nullable=false) private Recipe recipe; private double calories,protein,carbohydrates,fat,fiber,sodium; private String nutritionSource; }
