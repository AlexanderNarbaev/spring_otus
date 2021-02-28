package ru.otus.hw01.ioc.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnswerTest {

  public static final String ANSWER_TEXT = "TEST";
  public static final double ANSWER_POINT = 1.0d;

  @Test
  public void testAnswer() {
    Answer answer = new Answer(ANSWER_TEXT, ANSWER_POINT);
    assertEquals(ANSWER_TEXT, answer.getAnswerText());
    assertEquals(ANSWER_POINT, answer.getPoint());
  }
}
