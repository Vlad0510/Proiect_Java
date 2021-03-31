package Proiect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Masina masina1 = new Masina("7600 euro", "20/01/2021 - 22/01/2021", 2014,"Volkswagen passat", "alb", 2.0, "Tapiterie piele");
        Masina masina2 = new Masina("13250 euro", "16/02/2021 - 19/02/2021", 2016,"Audi A4", "negru", 2.0, "Tapiterie piele");
        Masina masina3 = new Masina("40000 euro", "4/03/2021 - 6/03/2021", 2000,"Porsche Cayenne", "negru", 3.0, "Tapiterie piele");

        Arta art1 = new Arta("1200 lei", "12/01/2021 - 13/04/2021", 1900, "Pictura", "Car cu boi", "Nicolae Grigorescu");
        Arta art2 = new Arta("20000 euro", "31/03/2021 - 17/04/2021", 1967, "Sculptura", "Chicago Picasso", "Pablo Picasso");
        Arta art3 = new Arta("50520 euro", "05/03/2021 - 05/04/2021", 1921, "Pictura", "Three Musicians", "Pablo Picasso");

        Ceas ceas1 = new Ceas("3900 lei", "26/03/2021 - 19/04/2021", 1995, "Ceas cu cuc", "Mayak");
        Ceas ceas2 = new Ceas("1250 lei", "20/03/2021 - 20/04/2021", 2020, "Ceas de mana", "Fossil");
        Ceas ceas3 = new Ceas("1650 lei", "28/03/2021 - 31/04/2021", 2021, "Ceas de mana", "Casio");

        Imobil ap1 = new Imobil("44000 euro", "01/04/2021 - 07/04/2021", 2015, "apartament","116 mp", "Ostroveni");
        Imobil casa1 = new Imobil("150000 euro", "02/04/2021 - 05/04/2021", 2017, "casa", "400 mp", "Goranu");
        Imobil ap2 = new Imobil("60500 euro", "01/04/2021 - 04/04/2021", 2018, "apartament", "180 mp", "Nord");

        Mobila mob1 = new Mobila("180 euro", "30/03/2021 - 03/04/2021", 1765, "dulap", "lemn, stejar");
        Mobila mob2 = new Mobila("1200 euro", "02/04/2021 - 05/04/2021", 1678, "masa", "lemn");
        Mobila mob3 = new Mobila("500 euro", "05/04/2021 - 10/04/2021", 1800, "cufar", "alama");

        Oferta oferta1 = new Oferta(1, masina1);
        Oferta oferta2 = new Oferta(2, art1);
        Oferta oferta3 = new Oferta(3, ceas1);
        Oferta oferta4 = new Oferta(4, ceas2);
        Oferta oferta5 = new Oferta(5, ap1);
        Oferta oferta6 = new Oferta(6, mob1);


        List<Arta> artaList = new ArrayList<>();
        artaList.addAll(Arrays.asList(art1, art2, art3));

        long count = artaList.stream()
                .filter(arta -> arta.getAutor().equals("Pablo Picasso"))
                .count();
        System.out.println(count);

        List<Imobil> imobilList = new ArrayList<>();
        imobilList.addAll(Arrays.asList(ap1, casa1, ap2));

        for(Imobil imobil: imobilList) {
            System.out.println(imobil.getZona());
        }

        List<Masina> masinaList = new ArrayList<>();
        masinaList.addAll(Arrays.asList(masina1, masina2, masina3));

        List<Masina> masinisortate = masinaList.stream()
                .sorted(Comparator.comparing(Masina::getModel))
                .collect(Collectors.toList());

        for(Masina masina: masinisortate) {
            System.out.println(masina.getModel());
        }

        Serviciu serviciu = new Serviciu();
        serviciu.AdaugaOferta(oferta1);
        serviciu.AdaugaOferta(oferta2);
        serviciu.AdaugaOferta(oferta3);
        serviciu.AdaugaOferta(oferta4);
        serviciu.AdaugaOferta(oferta5);
        serviciu.AdaugaOferta(oferta6);

        serviciu.CreareOferta(7, ceas3);
        serviciu.CreareOferta(8, mob2);

        serviciu.AfiseazaOferte();
    }
}
