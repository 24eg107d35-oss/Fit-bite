package com.fitbite.entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.Instant; import java.util.*;
@Entity @Table(name="users", indexes={@Index(name="idx_user_email",columnList="email")})
@Getter @Setter @NoArgsConstructor @Builder @AllArgsConstructor
public class User {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(nullable=false) private String name;
 @Column(nullable=false,unique=true) private String email;
 @Column(nullable=false) private String password;
 @ManyToMany(fetch=FetchType.EAGER) @JoinTable(name="user_roles",joinColumns=@JoinColumn(name="user_id"),inverseJoinColumns=@JoinColumn(name="role_id")) @Builder.Default private Set<RoleEntity> roles=new HashSet<>();
 @OneToOne(mappedBy="user",cascade=CascadeType.ALL,orphanRemoval=true) private UserPreference preferences;
 @ManyToMany @JoinTable(name="favorites",joinColumns=@JoinColumn(name="user_id"),inverseJoinColumns=@JoinColumn(name="recipe_id")) @Builder.Default private Set<Recipe> favorites=new HashSet<>();
 @Column(nullable=false) @Builder.Default private Instant createdAt=Instant.now();
}
