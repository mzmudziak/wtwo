package com.umcs;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SumarycznaKomenda implements Komenda {
  private int godzina;
  private int minuta;
  private String sciezka;


  public SumarycznaKomenda(String sciezka, int godzina, int minuta) {
    this.godzina = godzina;
    this.minuta = minuta;
    this.sciezka = sciezka;
  }

  @Override
  public void execute() {
    try {
      FileWriter fw = new FileWriter(sciezka, true);
      System.out.println("Zapisuje do pliku...");
      fw.write("SUM: " + getSum() + '\n');
      fw.close();
    } catch (IOException e) {
      System.err.println("IOException: " + e.getMessage());
    }
  }

  private int getSum() {
    List<Integer> list = new ArrayList<>();
    File file = new File(sciezka);

    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      String text;
      while ((text = reader.readLine()) != null) {

        try {
          Integer nowyInt = Integer.parseInt(text);
          list.add(nowyInt);
        } catch (NumberFormatException nf) {
          // nie rob nic - napis a nie liczba..
        }
      }
    } catch (IOException e) {
      System.err.println("IOException: " + e.getMessage());
    }
    int sum = 0;
    for (Integer i :
      list) {
      sum += i;
    }
    System.out.println("Nowa suma:  " + sum);
    return sum;
  }

  public Integer getGodzina() {
    return godzina;
  }

  public Integer getMinuta() {
    return minuta;
  }
}
