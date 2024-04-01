package com.example.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class BoardController {

  @GetMapping("/board/latest-list")
  public String latestList() {
      return null;
  }

  @GetMapping("top3")
  public String top3() {
      return null;
  }

  @GetMapping({
    "/board/search-list/{searchWord}",
    "/board/search-list/{searchWord}/{preSearchWord}"
  })
  public String searchList() {
    return null;
  }

  @GetMapping("/board/user-board-list/{email}")
  public String userBoardList () {
    return null;
  }

  @GetMapping("/board/{boardNumber}")
  public String boardNumber () {
    return null;
  }

  @GetMapping("/board/{boardNumber}/favorite-list")
  public String favoriteList () {
    return null;
  }

  @GetMapping("/board/{boardNumber}/comment-list")
  public String commentList () {
    return null;
  }

  @PostMapping("/board")
  public String board () {
    return null;
  }

  @PostMapping("/board/{boardNumber}/comment")
  public String comment () {
    return null;
  }

  @PatchMapping("/board/{boardNumber}")
  public String patchBoardNumber() {
    return null;
  }
}
