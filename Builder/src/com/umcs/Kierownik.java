package com.umcs;

import java.io.IOException;

public class Kierownik {
  private Builder builder;


  public Kierownik(Builder builder) {
    this.builder = builder;
  }

  public String wygenerujNapis(int[] tab) throws IOException {
    return builder
      .budujNaglowek()
      .budujTagi()
      .budujBody(tab)
      .build()
      .toString();
  }
}
