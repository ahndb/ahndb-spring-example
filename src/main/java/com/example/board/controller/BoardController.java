package com.example.board.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.dto.response.ResponseDto;
import com.example.board.service.BoardService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {

  private final BoardService BoardService;

  @GetMapping("/latest-list")
  public ResponseEntity<? super GetLatestListResponseDto> getLatestList() {
      return null;
  }

  @GetMapping("/top3")
  public String top3() {
      return null;
  }

  @GetMapping({
    "/search-list/{searchWord}",
    "/search-list/{searchWord}/{preSearchWord}"
  })
  public String searchList() {
    return null;
  }

  // 특정 유저 게시물 리스트
  @GetMapping("/user-board-list/{email}")
  public String userBoardList () {
    return null;
  }

  // 게시물 상세
  @GetMapping("/{boardNumber}")
  public String getBoardNumber () {
    return null;
  }

  // 좋아요 리스트
  @GetMapping("/{boardNumber}/favorite-list")
  public String favoriteList () {
    return null;
  }

  // 댓글 리스트
  @GetMapping("/{boardNumber}/comment-list")
  public String commentList () {
    return null;
  }

  // 게시물 작성
  @PostMapping("/")
  public String board () {
    return null;
  }

  // 댓글 작성
  @PostMapping("/{boardNumber}/comment")
  public String comment () {
    return null;
  }

  // 게시물 수정
  @PatchMapping("/{boardNumber}")
  public String patchBoardBoardNumber() {
    return null;
  }

  // 좋아요 기능
  @PutMapping("/{boardNumber}/favorite")
  public String favorite() {
    return null;
  }

  // 게시물 삭제
  @DeleteMapping("/{boardNumber}")
  public String delete() {
    return null;
  }


}

