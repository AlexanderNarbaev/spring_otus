package ru.otus.hw01.ioc.dao;

import ru.otus.hw01.ioc.model.Question;

import java.util.List;

/** Работа с хранилищем вопросов */
public interface QuestionDao {
  /**
   * Получить набор вопросов
   *
   * @return набор вопросов
   */
  List<Question> findAll();
}
