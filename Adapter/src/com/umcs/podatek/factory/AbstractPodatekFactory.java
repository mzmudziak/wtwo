package com.umcs.podatek.factory;

import com.umcs.podatek.Podatek;

public interface AbstractPodatekFactory {
  Podatek podatekLiniowy();
  Podatek podatekProgresywny();
}
