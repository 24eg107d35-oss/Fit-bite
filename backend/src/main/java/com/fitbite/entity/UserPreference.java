package com.fitbite.entity;
import jakarta.persistence.*; import lombok.*;
@Entity @Table(name="user_preferences") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class UserPreference { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @OneToOne @JoinColumn(name="user_id",unique=true,nullable=false) private User user; private String dietaryType; private String healthGoal; private Integer maxCalories; private Integer minProtein; private Integer maxCookingTime; }
