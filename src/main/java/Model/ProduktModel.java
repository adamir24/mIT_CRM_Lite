package Model;

import Config.DBmanager;
import Entity.Produkt;

import javax.persistence.EntityManager;

public class ProduktModel {

        public void dodajProdukt(String nazwaProdkutu, int iloscProduktu){
            EntityManager entityManager = DBmanager.getManager().createEntityManager();
            Produkt produkt = new Produkt();
            produkt.setNazwaProdkutu(nazwaProdkutu);
            produkt.setIloscProduktu(iloscProduktu);

            entityManager.getTransaction().begin();
            entityManager.persist(produkt);
            entityManager.getTransaction().commit();

            entityManager.close();
        }

}
