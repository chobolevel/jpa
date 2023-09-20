package com.example.jpa.controller;

import com.example.jpa.entity.Board;
import com.example.jpa.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board/")
public class BoardController {

  private final BoardRepository boardRepository;

  @GetMapping("{id}")
  public ResponseEntity<?> boardList(@PathVariable Long id) {
    return new ResponseEntity<>(boardRepository.findOneById(id), HttpStatus.OK);
  }

  @PostMapping("")
  public ResponseEntity<?> create(@RequestBody Board board) {
    boardRepository.save(board);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

}
