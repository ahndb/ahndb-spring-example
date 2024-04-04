package com.example.board.service;

import org.springframework.http.ResponseEntity;

import com.example.board.dto.request.auth.SignInRequestDto;
import com.example.board.dto.request.auth.SignUpRequestDto;
import com.example.board.dto.response.ResponseDto;

public interface AuthService {
  
  ResponseEntity<ResponseDto>singIn(SignInRequestDto dto);

  ResponseEntity<ResponseDto>signUp(SignUpRequestDto dto);

}
