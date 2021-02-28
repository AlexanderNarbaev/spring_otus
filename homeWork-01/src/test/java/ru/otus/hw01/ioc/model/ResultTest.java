package ru.otus.hw01.ioc.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResultTest {

  @Test
  public void testQuestion() {
    LocalDateTime now = LocalDateTime.now();
    ArrayList<Question> questions = new ArrayList<>();
    ArrayList<Answer> answers = new ArrayList<>();
    Exam exam = new Exam(now, questions);
    Result result = new Result(exam, answers);
    assertEquals(exam, result.getExam());
    assertEquals(answers, result.getSelectedAnswers());
  }
}
