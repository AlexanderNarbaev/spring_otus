package ru.otus.hw01.ioc.service;

import ru.otus.hw01.ioc.dao.AnswerDao;
import ru.otus.hw01.ioc.dao.QuestionDao;
import ru.otus.hw01.ioc.model.Exam;
import ru.otus.hw01.ioc.model.Question;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CsvExamService implements ExamService {

  private final AnswerDao answerDao;
  private final QuestionDao questionDao;

  public CsvExamService(AnswerDao answerDao, QuestionDao questionDao) {
    this.answerDao = answerDao;
    this.questionDao = questionDao;
  }

  @Override
  public Exam getNewExam() {
    try {
      List<Question> questions = questionDao.findAll();
      List<Question> fulfilledQuestions = new ArrayList<>();
      for (Question question : questions) {
        fulfilledQuestions.add(new Question(answerDao.getAnswerForQuestion(question),question.getQuestionText()));
      }
      return new Exam(LocalDateTime.now(), fulfilledQuestions);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}
