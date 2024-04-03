package com.example.board.dto.request.auth;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignUpRequestDto {
  
  @Pattern(regexp = "^[a-zA-Z0-9]*@([-.]?[a-zA-Z0-9])*\\.[a-zA-Z]{2,4}$")
  @NotBlank
  private String email;

  @Length(min=8, max=20)
  @NotBlank
  private String password;

  @NotBlank
  private String nickname;

  @Pattern(regexp = "^[0-9]{10,12}$")
  @NotBlank
  private String telNumber;

  @NotBlank
  private String address;

  private String addressDetail;
}
