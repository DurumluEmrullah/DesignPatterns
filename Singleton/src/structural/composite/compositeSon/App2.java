package structural.composite.compositeSon;

import structural.composite.compositeSon.Paket;
import structural.composite.compositeSon.Sepet;
import structural.composite.compositeSon.Urun;

import java.math.BigDecimal;

public class App2 {

    public static void main(String[] args) {
         Urun domates=new  Urun("Domates", BigDecimal.TEN);
         Urun patates=new  Urun("Patates",BigDecimal.valueOf(3));
         Urun sogan = new  Urun("Soğan",BigDecimal.ONE);

         Paket sebzePaketi=new  Paket("Sebze paketi");
         sebzePaketi.getUrunList().add(domates);
         sebzePaketi.getUrunList().add(patates);
         sebzePaketi.getUrunList().add(sogan);

         Urun sesSistemi=new  Urun("Ses sistemi ",BigDecimal.valueOf(3000));
         Urun kulaklik = new Urun("Kulaklik",BigDecimal.valueOf(700));

         Paket teknolojiPaketi=new Paket("Teknoloji paketi");
         teknolojiPaketi.getUrunList().add(sesSistemi);
         teknolojiPaketi.getUrunList().add(kulaklik);

         Urun futbolTopu = new Urun("Futbol topu",BigDecimal.valueOf(100));





         Kumanya kumanya = new Kumanya("Ramazan Kumanyasi");

         Urun yag = new Urun("Yag",BigDecimal.valueOf(50));

         kumanya.getPaketList().add(sebzePaketi);
         kumanya.getUrunList().add(yag);

        Sepet sepet= new Sepet("Benim Sepetim");
        sepet.getFiyatlanabilirList().add(teknolojiPaketi);
        sepet.getFiyatlanabilirList().add(sebzePaketi);
        sepet.getFiyatlanabilirList().add(futbolTopu);
        sepet.getFiyatlanabilirList().add(kumanya);

        BigDecimal toplamTutar= sepet.toplamOdenecekTutar();


         System.out.println(sepet.getAdi()+" sepetinin toplam fiyati "+ toplamTutar + " TL");
    }
}
