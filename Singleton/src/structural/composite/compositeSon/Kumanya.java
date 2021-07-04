package structural.composite.compositeSon;

import java.math.BigDecimal;
import java.util.*;

public class Kumanya implements Fiyatlanabilir{

    private String adi;
    private List<Urun> urunList;
    private List<Paket> paketList;

    public Kumanya(String adi) {
        this.adi = adi;
        urunList=new ArrayList<>();
        paketList=new ArrayList<>();
    }

    @Override
    public BigDecimal getFiyat() {

        BigDecimal toplamTutar=BigDecimal.ZERO;

        toplamTutar =toplamTutar.add(HesaplamaUtil.getToplamUrunFiyat(urunList));
        toplamTutar=toplamTutar.add(HesaplamaUtil.getToplamPaketFiyat(paketList));
        return toplamTutar;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Urun> getUrunList() {
        return urunList;
    }

    public void setUrunList(List<Urun> urunList) {
        this.urunList = urunList;
    }

    public List<Paket> getPaketList() {
        return paketList;
    }

    public void setPaketList(List<Paket> paketList) {
        this.paketList = paketList;
    }
}
