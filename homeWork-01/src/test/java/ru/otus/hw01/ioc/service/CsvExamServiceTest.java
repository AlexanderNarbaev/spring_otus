package ru.otus.hw01.ioc.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import ru.otus.hw01.ioc.dao.AnswerDao;
import ru.otus.hw01.ioc.dao.QuestionDao;
import ru.otus.hw01.ioc.model.Answer;
import ru.otus.hw01.ioc.model.Exam;
import ru.otus.hw01.ioc.model.Question;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

class CsvExamServiceTest {
  private static final String ANSWER_TEXT = "Answer Text";
  private static final double ANSWER_POINT = 0d;
  private static final String QUESTION_TEXT = "Question text";
  @Mock AnswerDao answerDao;
  @Mock QuestionDao questionDao;
  @InjectMocks CsvExamService csvExamService;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testGetNewExam() {
    when(answerDao.getAnswerForQuestion(any()))
        .thenReturn(Collections.<Answer>singletonList(new Answer(ANSWER_TEXT, ANSWER_POINT)));
    when(questionDao.findAll())
        .thenReturn(
            Collections.<Question>singletonList(
                new Question(
                    Collections.<Answer>singletonList(new Answer(ANSWER_TEXT, ANSWER_POINT)),
                    QUESTION_TEXT)));

    Exam result = csvExamService.getNewExam();
    assertNotNull(result);
    assertFalse(result.getExamQuestions().isEmpty());
    assertFalse(result.getExamQuestions().get(0).getAnswers().isEmpty());
  }
}
