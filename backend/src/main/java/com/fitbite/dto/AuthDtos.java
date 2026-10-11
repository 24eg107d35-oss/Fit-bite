package com.fitbite.dto;
import jakarta.validation.constraints.*; import java.util.Set;
public final class AuthDtos { private AuthDtos(){}
 public record RegisterRequest(@NotBlank @Size(min=2,max=80) String name,@NotBlank @Email String email,@NotBlank @Size(min=8,max=100) String password){}
 public record LoginRequest(@NotBlank @Email String email,@NotBlank String password){}
 public record AuthResponse(String token,Long userId,String name,String email,Set<String> roles){}
}
