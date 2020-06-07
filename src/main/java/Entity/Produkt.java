package Entity;

import javax.persistence.*;

@Entity
@Embeddable
public class Produkt {
    
    @Id
    @GeneratedValue
    private long produktID;
    private String nazwaProdkutu;
    private int iloscProduktu;

    public Produkt() {
        this.produktID = produktID;
        this.nazwaProdkutu = nazwaProdkutu;
        this.iloscProduktu = iloscProduktu;
    }

    public long getProduktID() {
        return produktID;
    }

    public void setProduktID(long produktID) {
        this.produktID = produktID;
    }

    public String getNazwaProdkutu() {
        return nazwaProdkutu;
    }

    public void setNazwaProdkutu(String nazwaProdkutu) {
        this.nazwaProdkutu = nazwaProdkutu;
    }

    public int getIloscProduktu() {
        return iloscProduktu;
    }

    public void setIloscProduktu(int iloscProduktu) {
        this.iloscProduktu = iloscProduktu;
    }


}
