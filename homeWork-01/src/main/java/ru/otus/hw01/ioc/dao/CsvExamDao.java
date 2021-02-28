package ru.otus.hw01.ioc.dao;

import ru.otus.hw01.ioc.model.Exam;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CsvExamDao implements ExamDao {
  @Override
  public List<Exam> findAllExams() {
    List<Exam> result = new ArrayList<>();
    result.add(new Exam(LocalDateTime.now(), new ArrayList<>()));
    return result;
  }
}
