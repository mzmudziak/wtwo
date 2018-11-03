package com.umcs.adapter;

public class EuroToDollarAdapter implements PriceAdapter {
  private double wartosc;

  public EuroToDollarAdapter(double wartosc) {
    this.wartosc = wartosc;
  }


  @Override
  public double convert() {
    return wartosc * 3.8 / 3;
  }
}

