package ru.otus.hw01.ioc.model;

import java.util.List;

/** Модель данных вопроса */
public class Question {
  /** Список ответов к вопросу */
  private final List<Answer> answers;
  /** Текст вопроса */
  private final String questionText;

  /**
   * Конуструтор вопроса
   *
   * @param answers набор ответов
   * @param questionText текст вопроса
   */
  public Question(List<Answer> answers, String questionText) {
    this.answers = answers;
    this.questionText = questionText;
  }

  /**
   * Получить текст вопроса
   *
   * @return строковое представление вопроса
   */
  public String getQuestionText() {
    return questionText;
  }

  /**
   * Получить ответы
   *
   * @return набор ответов
   */
  public List<Answer> getAnswers() {
    return answers;
  }
}
