package it.unimi.di.sweng.esame.model;

import org.jetbrains.annotations.NotNull;

import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ModelState  {

  public void readFile() {
    InputStream is = ModelState.class.getResourceAsStream("/excursions.csv");
    assert is != null;
    Scanner s = new Scanner(is);

    while (s.hasNextLine()) {
      String linea = s.nextLine();
      String[] el = linea.split(",");

      //TODO memorizzare in strutture dati opportuno quanto letto dal file

      System.err.println(linea);
    }
  }
}
