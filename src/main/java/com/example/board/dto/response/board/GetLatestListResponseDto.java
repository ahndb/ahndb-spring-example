package com.example.board.dto.response.board;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.board.dto.response.ResponseCode;
import com.example.board.dto.response.ResponseDto;
import com.example.board.dto.response.ResponseMessage;
import com.example.board.dto.response.board.item.BoardListItem;

import lombok.Getter;

@Getter
public class GetLatestListResponseDto extends ResponseDto {
  // 3개가 한 세트가 됨 
  private List<BoardListItem> latestList; // 속성의 값만 바꾸는 느낌

  public GetLatestListResponseDto(List<BoardListItem> latestList) {
    super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
    this.latestList = latestList;
  }

  // 안 옳긴 이유
  public static ResponseEntity<GetLatestListResponseDto> success(List<BoardListItem> latestList) {
    GetLatestListResponseDto body = new GetLatestListResponseDto(latestList);
    return ResponseEntity.status(HttpStatus.OK).body(body);
  }

}

