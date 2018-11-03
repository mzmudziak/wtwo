package com.umcs;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] arr = {
                -300, -200, -100, -50, 0, 50, 100, 200, 300, 1000
        };
        Kierownik kierownik = new Kierownik(new WavBuilder());
        Kierownik kierownikmp3 = new Kierownik(new Mp3Builder());
        Kierownik kierownikOgg = new Kierownik(new OggBuilder());


        System.out.println(kierownik.wygenerujNapis(arr));
        System.out.println(kierownikmp3.wygenerujNapis(arr));
        System.out.println(kierownikOgg.wygenerujNapis(arr));

    }
}
