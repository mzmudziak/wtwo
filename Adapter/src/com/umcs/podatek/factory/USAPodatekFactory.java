package com.umcs.podatek.factory;

import com.umcs.PodatekLiniowy;
import com.umcs.podatek.Podatek;
import com.umcs.podatek.PodatekProgresywny;

public class USAPodatekFactory implements AbstractPodatekFactory {
  @Override
  public Podatek podatekLiniowy() {
    return new PodatekLiniowy(10);
  }

  @Override
  public Podatek podatekProgresywny() {
    return new PodatekProgresywny(10, 10);
  }
}

