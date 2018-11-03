package com.umcs.podatek;


import com.umcs.przedmiot.Przedmiot;

public class PodatekProgresywny implements Podatek {
  private double dolnyProg;
  private double gornyProg;

  public PodatekProgresywny(double dolnyProg, double wysokiProg) {
    this.dolnyProg = dolnyProg;
    this.gornyProg = wysokiProg;
  }

  @Override
  public double pobierz(Przedmiot przedmiot) {
    double podatek;
    if(przedmiot.okreslWartosc() <= 10000) {
      podatek = dolnyProg / 100;
    } else {
      podatek = gornyProg / 100;
    }
    return przedmiot.okreslWartosc() - przedmiot.okreslWartosc() * podatek;
  }

}
