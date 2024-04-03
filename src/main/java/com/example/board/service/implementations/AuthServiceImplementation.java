package com.example.board.service.implementations;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.board.dto.request.auth.SignUpRequestDto;
import com.example.board.dto.response.ResponseDto;
import com.example.board.repository.UserRepository;
import com.example.board.service.AuthService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImplementation implements AuthService {

  private final SignUpRequestDto signUpRequestDto;

  @Override
  public ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto) {
  
    try {
      // 조회
      SignUpResponseDto signUpResponseDto = signUpResponseDto.

      // 중복된 이메일
      
      // 중복된 닉네임
      // 중복된 휴대전화번호 
      // 성공
      
    } catch (Exception exception) {
      exception.printStackTrace();

      // 데이터베이스 오류
    }
  }
  
}

