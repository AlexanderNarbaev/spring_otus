package ru.otus.hw01.ioc.service;

import ru.otus.hw01.ioc.model.Exam;

/** Сервис экзаменов и тестирования */
public interface ExamService {
  /**
   * Получить новый экзамен/тестирование
   *
   * @return экзамен/тестирование
   */
  Exam getNewExam();
}
