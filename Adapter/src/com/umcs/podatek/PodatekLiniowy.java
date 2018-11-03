package com.umcs;

import com.umcs.podatek.Podatek;
import com.umcs.przedmiot.Przedmiot;

public class PodatekLiniowy implements Podatek {
  private double podatek;

  public PodatekLiniowy(double podatek) {
    this.podatek = podatek;
  }

  @Override
  public double pobierz(Przedmiot przedmiot) {
    return przedmiot.okreslWartosc() - przedmiot.okreslWartosc() * podatek / 100;
  }
}
