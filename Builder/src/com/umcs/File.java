package com.umcs;

public class File {
  private String naglowek;
  private String tag;
  private String body;

  public File(String naglowek, String tag, String body) {
    this.naglowek = naglowek;
    this.tag = tag;
    this.body = body;
  }

  @Override
  public String toString() {
    return "File{" +
      "naglowek='" + naglowek + '\'' +
      ", tag='" + tag + '\'' +
      ", body='" + body + '\'' +
      '}';
  }
}
