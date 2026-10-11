package com.fitbite.entity;
import jakarta.persistence.*; import lombok.*; import java.time.Instant;
@Entity @Table(name="recommendations") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Recommendation { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) @JoinColumn(name="user_id") private User user; @ManyToOne(optional=false) @JoinColumn(name="recipe_id") private Recipe recipe; private double score; @Builder.Default private Instant createdAt=Instant.now(); }
