package ru.otus.hw01.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.hw01.ioc.model.Answer;
import ru.otus.hw01.ioc.model.Exam;
import ru.otus.hw01.ioc.model.Question;
import ru.otus.hw01.ioc.service.ExamService;

import java.time.format.DateTimeFormatter;

/** Основнлй класс - точка входа в приложение */
public class Main {
  /**
   * Базовый метод
   *
   * @param args аргументы командной строки
   */
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("/spring-context.xml");
    ExamService examService = context.getBean(ExamService.class);
    Exam newExam = examService.getNewExam();
    System.out.println(
        "Exam time:\t "
            + newExam.getExamDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
    for (Question question : newExam.getExamQuestions()) {
      System.out.println("Question:\t " + question.getQuestionText());
      for (Answer answer : question.getAnswers()) {
        System.out.println("Answer:\t " + answer.getAnswerText());
      }
    }
  }
}
