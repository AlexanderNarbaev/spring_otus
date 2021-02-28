package ru.otus.hw01.ioc.dao;

import org.junit.jupiter.api.Test;
import ru.otus.hw01.ioc.model.Exam;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CsvExamDaoTest {
  CsvExamDao csvExamDao = new CsvExamDao();

  @Test
  void testFindAllExams() {
    List<Exam> result = csvExamDao.findAllExams();
    assertNotNull(result);
    assertFalse(result.isEmpty());
  }
}
