package ru.otus.hw01.ioc.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExamTest {

  @Test
  public void testExam() {
    LocalDateTime now = LocalDateTime.now();
    ArrayList<Question> questions = new ArrayList<>();
    Exam exam = new Exam(now, questions);
    assertEquals(now, exam.getExamDate());
    assertEquals(questions, exam.getExamQuestions());
  }
}
