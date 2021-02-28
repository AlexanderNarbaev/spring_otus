package ru.otus.hw01.ioc.dao;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.core.io.Resource;

import java.io.FileReader;
import java.io.IOException;

public abstract class AbstractCsvDao {

  private final Resource csvFile;

  public AbstractCsvDao(Resource csvFile) {
    this.csvFile = csvFile;
  }

  public Iterable<CSVRecord> readRepository() throws IOException {
    return CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(new FileReader(csvFile.getFile()));
  }
}
