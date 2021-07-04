package structural.composite.compositeIlk;

import java.math.BigDecimal;

public class App1 {
    public static void main(String[] args) {

        Urun domates=new Urun("Domates", BigDecimal.TEN);
        Urun patates=new Urun("Patates",BigDecimal.valueOf(3));
        Urun sogan = new Urun("Soğan",BigDecimal.ONE);

        Paket sebzePaketi=new Paket("Sebze paketi");
        sebzePaketi.getUrunList().add(domates);
        sebzePaketi.getUrunList().add(patates);
        sebzePaketi.getUrunList().add(sogan);

        Urun sesSistemi=new Urun("Ses sistemi ",BigDecimal.valueOf(3000));
        Urun kulaklik = new Urun("Kulaklik",BigDecimal.valueOf(700));

        Paket teknolojiPaketi=new Paket("Teknoloji paketi");
        teknolojiPaketi.getUrunList().add(sesSistemi);
        teknolojiPaketi.getUrunList().add(kulaklik);


        Sepet sepet= new Sepet("Benim Sepetim");

        sepet.getPaketList().add(teknolojiPaketi);
        sepet.getPaketList().add(sebzePaketi);
        sepet.getUrunList().add(domates);
        sepet.getUrunList().add(sogan);


        System.out.println("Toplam tutar : "+sepet.getToplamTutar()+" TL");

    }
}
