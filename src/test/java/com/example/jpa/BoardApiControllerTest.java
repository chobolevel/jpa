package com.example.jpa;

import com.example.jpa.entity.Board;
import com.example.jpa.repository.BoardRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BoardApiControllerTest {

  @LocalServerPort
  private int port;

  @Autowired
  private TestRestTemplate restTemplate;

  @Autowired
  private BoardRepository boardRepository;

  @Test
  public void selectTest() {

    Board findBoard = boardRepository.findById("ef7783b7-a9b6-4089-8120-aadda97fb7bb");

    String url = "http://localhost:" + port + "/api/board/ef7783b7-a9b6-4089-8120-aadda97fb7bb";

    // given

    // when
    ResponseEntity<Board> responseEntity = restTemplate.getForEntity(url, Board.class);

    // then
    Assertions.assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
    Assertions.assertThat(responseEntity.getBody().getId()).isEqualTo(findBoard.getId());

  }

}
