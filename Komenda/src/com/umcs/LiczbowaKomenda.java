package com.umcs;

import java.io.FileWriter;
import java.io.IOException;

public class LiczbowaKomenda implements Komenda {
  private int godzina;
  private int minuta;
  private String sciezka;

  public LiczbowaKomenda(String sciezka, int godzina, int minuta) {
    this.godzina = godzina;
    this.minuta = minuta;
    this.sciezka = sciezka;
  }

  @Override
  public void execute() {
    try {
      System.out.println("Zapisuje do pliku...");
      FileWriter fw = new FileWriter(sciezka, true);
      fw.write("10000\n");
      fw.close();
    } catch (IOException ioe) {
      System.err.println("IOException: " + ioe.getMessage());
    }
  }

  public Integer getMinuta() {
    return minuta;
  }

  public Integer getGodzina() {
    return godzina;
  }
}
