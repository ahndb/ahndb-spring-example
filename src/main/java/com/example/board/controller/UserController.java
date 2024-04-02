package com.example.board.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
  
  private final UserService userService;

  // 유저 정보
  @GetMapping("/{email}")
  public ResponseEntity<? super GetUserResponseDto> getUser(
    @PathVariable("email") String email
  ){
    
  }
  }

  // 닉네임 수정
  @PatchMapping("/nickname")
  public String nickname() {
    return null;
  }

  // 프로필 이미지 수정
  @PatchMapping("/profile-image")
  public String profileImage() {
    return null;
  }

  



}
