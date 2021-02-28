package ru.otus.hw01.ioc.dao;

import org.apache.commons.csv.CSVRecord;
import org.springframework.core.io.Resource;
import ru.otus.hw01.ioc.model.Answer;
import ru.otus.hw01.ioc.model.Question;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvAnswerDao extends AbstractCsvDao implements AnswerDao {

  protected CsvAnswerDao(Resource csvFile) {
    super(csvFile);
  }

  @Override
  public List<Answer> getAnswerForQuestion(Question question) {
    List<Answer> result = new ArrayList<>();
    try {
      for (CSVRecord record : readRepository()) {
        if (record.get(0).equalsIgnoreCase(question.getQuestionText())) {
          for (int i = 1; i < record.size(); i++) {
            result.add(new Answer(record.get(i), Double.parseDouble(record.get(++i))));
          }
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return result;
  }

  @Override
  public List<Answer> getAllAnswer() {
    List<Answer> result = new ArrayList<>();
    try {
      for (CSVRecord record : readRepository()) {
        for (int i = 1; i < record.size(); i++) {
          result.add(new Answer(record.get(i), Double.parseDouble(record.get(++i))));
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return result;
  }
}
