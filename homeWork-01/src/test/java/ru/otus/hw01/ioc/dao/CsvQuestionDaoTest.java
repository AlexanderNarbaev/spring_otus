package ru.otus.hw01.ioc.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ru.otus.hw01.ioc.model.Question;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("/spring-context.xml")
class CsvQuestionDaoTest {

  @Autowired CsvQuestionDao csvQuestionDao;

  @Test
  void testFindAll() {
    List<Question> result = csvQuestionDao.findAll();
    assertFalse(result.isEmpty());
  }
}
