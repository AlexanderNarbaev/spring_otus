package ru.otus.hw01.ioc.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ru.otus.hw01.ioc.model.Answer;
import ru.otus.hw01.ioc.model.Question;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("/spring-context.xml")
class CsvAnswerDaoTest {
  private static final String WRONG_QUESTION_TEXT = "questionText";
  private static final String RIGHT_QUESTION_TEXT = "Test question 1";

  @Autowired CsvAnswerDao csvAnswerDao;

  @Test
  void testGetAnswerForQuestion() {
    List<Answer> result =
        csvAnswerDao.getAnswerForQuestion(new Question(null, WRONG_QUESTION_TEXT));
    Assertions.assertTrue(result.isEmpty());
    result = csvAnswerDao.getAnswerForQuestion(new Question(null, RIGHT_QUESTION_TEXT));
    assertFalse(result.isEmpty());
  }

  @Test
  void testGetAllAnswer() {
    List<Answer> result = csvAnswerDao.getAllAnswer();
    assertFalse(result.isEmpty());
  }
}
