package com.umcs;

import java.util.Arrays;

public class WavBuilder implements Builder {
  private String naglowek;
  private String tag;
  private String body;

  public File build() {
    return new File(naglowek, tag, body);
  }

  public WavBuilder budujNaglowek() {
    this.naglowek = "WavHeader";
    return this;
  }

  public WavBuilder budujTagi() {
    this.tag = "";
    return this;
  }

  public WavBuilder budujBody(int[] tab) {
    this.body = Arrays.toString(tab);
    return this;
  }
}
