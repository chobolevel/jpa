package com.example.jpa.repository;

import com.example.jpa.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

  List<Board> findOneById(Long id);

}
