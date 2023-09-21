package com.example.jpa.controller;

import com.example.jpa.entity.Board;
import com.example.jpa.service.board.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardController {

  private final BoardService boardService;

  @GetMapping("{id}")
  public ResponseEntity<?> findOne(@PathVariable String id) {
    return new ResponseEntity<>(boardService.findById(id), HttpStatus.OK);
  }

  @PostMapping("")
  public ResponseEntity<?> create(@RequestBody Board board) {
    boardService.create(board);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

}
