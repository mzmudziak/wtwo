package com.umcs.adapter;

public class EuroToPlnAdapter implements PriceAdapter {
  private double wartosc;

  public EuroToPlnAdapter(double wartosc) {
    this.wartosc = wartosc;
  }

  @Override
  public double convert() {
    return wartosc * 4.2;
  }
}
