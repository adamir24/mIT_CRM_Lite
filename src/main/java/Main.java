import Entity.Produkt;
import Model.ProduktModel;

import javax.swing.*;
import java.util.logging.Logger;

public class Main {


    public static void main (String[] args) {
        JOptionPane.showMessageDialog(null, "Sef nie ksycy");

        Produkt produkt = new Produkt();
        produkt.setNazwaProdkutu("Jabadaba");
        produkt.setIloscProduktu(10);

        System.out.println(produkt.getNazwaProdkutu() + " " + produkt.getIloscProduktu());

        ProduktModel produktModel = new ProduktModel();
        produktModel.dodajProdukt("Drukarka", 1);
    }
}
