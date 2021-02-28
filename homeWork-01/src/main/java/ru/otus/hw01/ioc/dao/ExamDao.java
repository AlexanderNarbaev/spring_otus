package ru.otus.hw01.ioc.dao;

import ru.otus.hw01.ioc.model.Exam;

import java.util.List;

/** Работа с хранилищем тестирования */
public interface ExamDao {
  /**
   * Получить набор тестирования
   *
   * @return набор тестов
   */
  List<Exam> findAllExams();
}
