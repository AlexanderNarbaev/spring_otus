package ru.otus.hw01.ioc.dao;

import ru.otus.hw01.ioc.model.Answer;
import ru.otus.hw01.ioc.model.Question;

import java.util.List;

/** Работа с хранилищем ответов */
public interface AnswerDao {
  /**
   * Получить ответы к вопросу
   *
   * @param question Искомый вопрос
   * @return набор ответов
   */
  List<Answer> getAnswerForQuestion(Question question);

  /**
   * Получить все ответы
   *
   * @return набор ответов
   */
  List<Answer> getAllAnswer();
}
