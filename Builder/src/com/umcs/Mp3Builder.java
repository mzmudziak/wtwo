package com.umcs;

import java.io.IOException;

public class Mp3Builder implements Builder {
  private String naglowek;
  private String tag;
  private String body;

  public File build() {
    return new File(naglowek, tag, body);
  }

  public Mp3Builder budujNaglowek() {
    this.naglowek = "Mp3Header";
    return this;
  }

  public Mp3Builder budujTagi() {
    this.tag = "Mp3Tags";
    return this;
  }

  public Mp3Builder budujBody(int[] tab) throws IOException {
    this.body = Base64EncodedZip.encode(tab);
    return this;
  }
}
