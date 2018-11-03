package com.umcs;

public class Main {

    public static void main(String[] args) {
        Magazyn magazyn = new Magazyn();
        magazyn.dodajDoSpisu(new Ksiazka(1992, 5));
        magazyn.dodajDoSpisu(new Ksiazka(1987, 1));
        magazyn.dodajDoSpisu(new Obraz(1456));
        magazyn.dodajDoSpisu(new Obraz(997));
        magazyn.dodajDoSpisu(new Rzezba(2005, 3d));

        AbstrakcyjnaFabrykaPodatkow usa = new FabrykaUSA();
        AbstrakcyjnaFabrykaPodatkow pol = new FabrykaPOL();
        AbstrakcyjnaFabrykaPodatkow ger = new FabrykaGER();
        AbstrakcyjnaFabrykaPodatkow fra = new FabrykaFRA();

        System.out.println("Wartosci w USA:");
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(Przedmiot::okreslWartosc));
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(usa.pobierzPodatekLiniowy()));
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(usa.pobierzPodatekProgresywny()));

        System.out.println("Wartosci w POL:");
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(Przedmiot::okreslWartosc));
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(pol.pobierzPodatekLiniowy()));
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(pol.pobierzPodatekProgresywny()));

        System.out.println("Wartosci w GER:");
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(Przedmiot::okreslWartosc));
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(ger.pobierzPodatekLiniowy()));
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(ger.pobierzPodatekProgresywny()));

        System.out.println("Wartosci w FRA:");
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(Przedmiot::okreslWartosc));
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(fra.pobierzPodatekLiniowy()));
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(fra.pobierzPodatekProgresywny()));
    }
}
