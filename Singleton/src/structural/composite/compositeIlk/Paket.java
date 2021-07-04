package structural.composite.compositeIlk;

import java.util.*;

public class Paket {

    private String adi;
    private List<Urun> urunList;

    public Paket(String adi) {
        this.adi = adi;
        this.urunList = new ArrayList<>();
    }

    public String getAdi() {
        return adi;
    }

    public List<Urun> getUrunList() {
        return urunList;
    }

    public void setUrunList(List<Urun> urunList) {
        this.urunList = urunList;
    }
}
