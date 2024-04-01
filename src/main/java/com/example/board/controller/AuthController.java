package com.example.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/vi")
public class AuthController {
  
  @PostMapping("/auth/sign-in")
  public String signIn(@RequestBody String entity) {
      return null;
  }

  @PostMapping("/auth/sign-up")
  public String signUp(@RequestBody String entity) {
      return null;
  }
  
  
}
