package ru.otus.hw01.ioc.model;

import java.time.LocalDateTime;
import java.util.List;

/** Модель теста */
public class Exam {
  /** Дата проведения тестирования */
  private final LocalDateTime examDate;
  /** Список вопросов теста */
  private final List<Question> examQuestions;

  /**
   * Конуструтор lzk построения теста
   *
   * @param examDate дата теста
   * @param examQuestions набор его вопросов
   */
  public Exam(LocalDateTime examDate, List<Question> examQuestions) {
    this.examDate = examDate;
    this.examQuestions = examQuestions;
  }

  /**
   * Получить дату теста
   *
   * @return локализованная дата со временем
   */
  public LocalDateTime getExamDate() {
    return examDate;
  }

  /**
   * Получить вопросы
   *
   * @return набор вопросов теста
   */
  public List<Question> getExamQuestions() {
    return examQuestions;
  }
}
