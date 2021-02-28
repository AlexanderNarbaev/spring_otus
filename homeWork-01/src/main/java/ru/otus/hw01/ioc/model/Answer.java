package ru.otus.hw01.ioc.model;

/** Модель данных ответа */
public class Answer {
  /** Текст ответа */
  private final String answerText;
  /** Значение баллов этого ответа */
  private final double point;

  /**
   * Конструктор для инициализации объекта
   *
   * @param answerText текст ответа
   * @param point количество баллов ответа
   */
  public Answer(String answerText, double point) {
    this.answerText = answerText;
    this.point = point;
  }

  /**
   * Получить текст ответа
   *
   * @return строковое представление
   */
  public String getAnswerText() {
    return answerText;
  }

  /**
   * Получить количество баллов этого ответа
   *
   * @return представление в виде дробного числа
   */
  public double getPoint() {
    return point;
  }
}
