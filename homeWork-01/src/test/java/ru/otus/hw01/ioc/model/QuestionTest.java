package ru.otus.hw01.ioc.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuestionTest {

  private static final String QUESTION_TEXT = "Test question 1";

  @Test
  public void testQuestion() {
    ArrayList<Answer> answers = new ArrayList<>();
    Question question = new Question(answers, QUESTION_TEXT);
    assertEquals(QUESTION_TEXT, question.getQuestionText());
    assertEquals(answers, question.getAnswers());
  }
}
