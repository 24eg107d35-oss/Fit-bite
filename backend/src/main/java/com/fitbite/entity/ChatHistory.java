package com.fitbite.entity;
import jakarta.persistence.*; import lombok.*; import java.time.Instant;
@Entity @Table(name="chat_history") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ChatHistory { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) @JoinColumn(name="user_id") private User user; @Column(nullable=false,length=4000) private String userMessage; @Column(nullable=false,length=8000) private String assistantMessage; @Builder.Default private Instant createdAt=Instant.now(); }
