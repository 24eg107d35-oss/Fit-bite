package com.fitbite.entity;
import jakarta.persistence.*; import lombok.*; import java.time.Instant;
@Entity @Table(name="recipe_history") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class RecipeHistory { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) @JoinColumn(name="user_id") private User user; @ManyToOne(optional=false) @JoinColumn(name="recipe_id") private Recipe recipe; @Builder.Default private Instant viewedAt=Instant.now(); }
