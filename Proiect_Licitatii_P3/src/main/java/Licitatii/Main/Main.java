package Licitatii.Main;

import Licitatii.Config.InitializeTable;
import Licitatii.Produse.*;
import Licitatii.repository.*;

public class Main {

    public static void main(String[] args) {
        InitializeTable.setUpDb();

        ArtaRepository.insertArta(new Arta(50, "2020-12-15", "2020-12-16", "1000", 1897, 5, "Pictura", "Masina de epoca", "Roberto"));
        ArtaRepository.updateArtaAutorById("Lucian", 2);
        ArtaRepository.deleteArtaById(2);

        CeasRepository.insertCeas(new Ceas(101, "2021-01-15", "2021-04-15", "500 euro", 2020, 2, "model", "cassio"));
        CeasRepository.updateCeasModelById("model nou", 1);
        CeasRepository.deleteCeasById(2);

        ImobilRepository.insertImobil(new Imobil(110, "2021-03-23", "2021-07-16", "100000 euro", 2020, 1, "apartament", "Centru"));
        ImobilRepository.updateImobilTipById("casa", 1);
        ImobilRepository.deleteImobilById(1);

        MasinaRepository.insertMasina(new Masina(200, "2021-07-27", "2021-10-13", "6000 euro", 2012, 1, "audi", "alb", 2.0));
        MasinaRepository.updateMasinaCuloareById("negru", 1);
        MasinaRepository.deleteMasinaById(1);

        MobilaRepository.insertMobila(new Mobila(300, "2021-03-23", "2021-10-13", "200 lei", 2017, 1, "scaun", "lemn"));
        MobilaRepository.updateMobilaMaterialById("fier", 1);
        MobilaRepository.deleteMobilaById(1);
    }
}
