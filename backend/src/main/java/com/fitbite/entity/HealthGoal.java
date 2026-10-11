package com.fitbite.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*; import lombok.*; import java.util.*;
@Entity @Table(name="health_goals") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class HealthGoal { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(nullable=false,unique=true) private String name; @Column(length=1000) private String description; @Column(length=1000) private String foodsToConsider; @Column(length=1000) private String foodsCommonlyLimited; @JsonIgnore @ManyToMany(mappedBy="healthGoals") @Builder.Default private Set<Recipe> recipes=new HashSet<>(); }
