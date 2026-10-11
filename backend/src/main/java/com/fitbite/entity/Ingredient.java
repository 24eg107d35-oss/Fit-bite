package com.fitbite.entity;
import jakarta.persistence.*; import lombok.*;
@Entity @Table(name="ingredients",indexes=@Index(name="idx_ingredient_name",columnList="name")) @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Ingredient { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(nullable=false,unique=true) private String name; private String unit; }
