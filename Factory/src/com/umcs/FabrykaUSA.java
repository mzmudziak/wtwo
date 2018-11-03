package com.umcs;

public class FabrykaUSA implements AbstrakcyjnaFabrykaPodatkow{
    @Override
    public Podatek pobierzPodatekLiniowy() {
        return new PodatekLiniowy(10);
    }

    @Override
    public Podatek pobierzPodatekProgresywny() {
        return new PodatekProgresywny(10, 10);
    }
}
