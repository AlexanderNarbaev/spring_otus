package ru.otus.hw01.ioc.dao;

import org.apache.commons.csv.CSVRecord;
import org.springframework.core.io.Resource;
import ru.otus.hw01.ioc.model.Question;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvQuestionDao extends AbstractCsvDao implements QuestionDao {
  protected CsvQuestionDao(Resource csvFile) {
    super(csvFile);
  }

  @Override
  public List<Question> findAll() {
    List<Question> result = new ArrayList<>();
    try {
      for (CSVRecord record : readRepository()) {
        result.add(new Question(new ArrayList<>(), record.get(0)));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return result;
  }
}
