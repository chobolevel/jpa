package com.example.jpa.repository;

import com.example.jpa.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

  Board findOneById(Long id);

}
