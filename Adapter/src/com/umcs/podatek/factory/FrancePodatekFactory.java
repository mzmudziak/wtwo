package com.umcs.podatek.factory;

import com.umcs.PodatekLiniowy;
import com.umcs.podatek.Podatek;
import com.umcs.podatek.PodatekProgresywny;

public class FrancePodatekFactory implements AbstractPodatekFactory {
  @Override
  public Podatek podatekLiniowy() {
    return new PodatekLiniowy(30);
  }

  @Override
  public Podatek podatekProgresywny() {
    return new PodatekProgresywny(30, 50);
  }
}

