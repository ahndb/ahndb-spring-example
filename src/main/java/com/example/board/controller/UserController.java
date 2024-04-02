package com.example.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
  
  // 유저 정보
  @GetMapping("/{email}")
  public String email() {
    return null;
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
