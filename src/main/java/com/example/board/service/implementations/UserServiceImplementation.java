package com.example.board.service.implementations;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.board.dto.request.user.NicknameRequestDto;
import com.example.board.dto.response.ResponseDto;
import com.example.board.repository.UserRepository;
import com.example.board.dto.response.user.GetUserResponseDto;
import com.example.board.entity.UserEntity;
import com.example.board.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {

  private final UserRepository userRepository;

  @Override
  public ResponseEntity<? super GetUserResponseDto> getUser(String email) {

    try {
      // 1. User 테이블에서 email에 해당하는 유저 조회
      // SELECT * FROM user WHERE email = :email
      // findByEmail(email)
      // (email -> (조회 결과 인스턴스))
      UserEntity userEntity = userRepository.findByEmail(email);

      // 2. 조회 결과에 따라 반환 결정
      // 1) false이면 존재하지 않는 유저 응답처리 X
      // 2) null 이면 존재하지 않는 유저 응답처리
      if (userEntity == null)
        return ResponseDto.notExistUser();

      // 3. 조회 결과 데이터를 성공 응답
      return GetUserResponseDto.success();

    } catch (Exception exception) {
      // 1-1. 조회 처리 중 데이터베이스관련 예외가 발생하면 데이터베이스 에러 응답처리
      exception.printStackTrace(); // 터미널에 어떤 예외가 발생했는지 알려줌
      return ResponseDto.databaseError();
    }

    // try {

    // return ResponseDto.notExistUser();

    // } catch (Exception exception) {
    // exception.printStackTrace();
    // return ResponseDto.databaseError();

    // }

    // return GetUserResponseDto.success("email@email.com", "홍길동", "null");
  }

  @Override
  public ResponseEntity<ResponseDto> nickname(NicknameRequestDto dto) {

    try {

      // 중복 닉네임 확인
      String nickname = dto.getNickname();
      boolean isExistNickname = userRepository.existsByNickname(nickname);
      if (isExistNickname)
        return ResponseDto.duplicateNickname();

      // 존재하지 않는 유저 email로 중복검사
      String email = dto.getEmail();
      boolean isExistEmail = userRepository.existsByEmail(email);
      if (!isExistEmail)
        return ResponseDto.notExistUser();

      // 데이터 저장하고
      UserEntity userEntity = new UserEntity(dto);
      userRepository.save(userEntity);

      // 성공 문구 반환
      return ResponseDto.success();

    } catch (Exception exception) {
      exception.printStackTrace();
      return ResponseDto.databaseError();
    }

  }

}
