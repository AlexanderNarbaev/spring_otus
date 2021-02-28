package ru.otus.hw01.ioc.model;

import java.util.List;

/** Модель, представляющая собой результат */
public class Result {
  /** Проводимый тест */
  private final Exam exam;
  /** Выбранные ответы */
  private final List<Answer> selectedAnswers;

  /**
   * Конструктор результата тестирвоания
   *
   * @param exam - проводимый тест
   * @param selectedAnswers - набор выбранных ответов
   */
  public Result(Exam exam, List<Answer> selectedAnswers) {
    this.exam = exam;
    this.selectedAnswers = selectedAnswers;
  }

  /**
   * Получить тестирование
   *
   * @return проводимый тест
   */
  public Exam getExam() {
    return exam;
  }

  /**
   * Получить набор выбранных ответов
   *
   * @return набор ответов
   */
  public List<Answer> getSelectedAnswers() {
    return selectedAnswers;
  }
}
