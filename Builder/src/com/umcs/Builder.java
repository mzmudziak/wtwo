package com.umcs;

import java.io.IOException;

public interface Builder {
  File build();

  Builder budujNaglowek();

  Builder budujTagi();

  Builder budujBody(int[] tab) throws IOException;
}
