package com.umcs;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Komenda> commands = new ArrayList<>();
        commands.add(new LiterowaKomenda("plik.txt", 10, 10));
        commands.add(new SumarycznaKomenda("plik.txt", 10, 12));
        commands.add(new LiterowaKomenda("plik.txt", 10, 20));
        commands.add(new LiczbowaKomenda("plik.txt", 10, 40));
        commands.add(new LiczbowaKomenda("plik.txt", 10, 30));
        commands.add(new SumarycznaKomenda("plik.txt", 10, 59));
        int godzina = 9;
        int minuta = 59;
        while (godzina != 11) {
            System.out.println("Jest godzina: " + godzina + ":" + minuta);
            for (Komenda k : commands) {
                if(k.getGodzina().equals(godzina) && k.getMinuta().equals(minuta)) {
                    System.out.println("Wykonuje komende.." + k);
                    k.execute();
                }
            }
            minuta++;
            if(minuta == 60) {
                minuta = 0;
                godzina++;
            }
        }
    }
}
