package com.example.board.service.implementations;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.board.dto.response.ResponseDto;
import com.example.board.entity.UserEntity;
import com.example.board.repository.UserRepository;
import com.example.board.dto.request.auth.SignInRequestDto;
import com.example.board.dto.request.auth.SignUpRequestDto;
import com.example.board.service.AuthService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImplementation implements AuthService {

  private final UserRepository userRepository;

  @Override
  public ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto) {

    try {
      // 1. 입력받은 이메일이 유저테이블에 존재하는지 조회
      // email -> (true, false)
      String email = dto.getEmail();
      boolean isExistEmail = userRepository.existsByEmail(email);

      // 1-1. 1에 대한 조회결과가 true일때 중복된 이메일 응답 처리
      if (isExistEmail) return ResponseDto.duplicateEmail();

      // 2. 입력받은 닉네임이 유저테이블에 존재하는지 조회
      // nickname -> (true, false)
      String nickname = dto.getNickname();
      boolean isExistNickname = userRepository.existsByNickname(nickname);
      // 2-1. 2에 대한 조회결과가 true일때 중복된 닉네임 응답 처리
      if (isExistNickname) return ResponseDto.duplicateNickname();
      
      // 3. 입력받은 휴대전화번호가 유저테이블에 존재하는지 조회
      // telNumber -> (true, false)
      String telNumber = dto.getTelNumber();
      boolean isExistTelNumber = userRepository.existsByTelNumber(telNumber);
      //! boolean이나 existsBy, findBy의 중요성 보다 로직에서 그게 필요한지 아닌지를 봐야함

      // 3-1. 3에 대한 조회결과가 true일때 중복된 휴대전화번호 응답 처리
      if (isExistTelNumber) return ResponseDto.duplicateTelNumber();

      // 4. 유저 레코드 삽입
      // 4-1. 유저 엔터티의 인스턴스 생성
      // (dto) -> userEntity 인스턴스
      UserEntity userEntity = new UserEntity(dto);

      // 4-2. 유저 엔터티 인스턴스 저장
      userRepository.save(userEntity);

      // 5. 성공 응답 처리
      return ResponseDto.success();

    } catch (Exception exception) {
      exception.printStackTrace();

      // 데이터베이스 오류
      return ResponseDto.databaseError();
    }

  }

  @Override
  public ResponseEntity<ResponseDto> singIn(SignInRequestDto dto) {
    return null;
    
  }

}
