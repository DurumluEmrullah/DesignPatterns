package creational.prototype;

import java.util.Date;

/**
 * @author Emrullah Durumlu
 *
 * <ol>
 *     <li>Maliyetli nesneleri daha az maliyetli halde oluşturmamıza yarar.</li>
 * </ol>
 */

public class App1 {
    public static void main(String[] args) {
        
        GenelEntityService genelEntityService = new GenelEntityService();

        Date ilkTarih = new Date();
        Belge belge1 = genelEntityService.findBelgeById(1L);
        Date sonTarih=new Date();

        long saniyeFarki = getSaniyeFarki(ilkTarih,sonTarih);
        System.out.println(belge1);
        System.out.println("Saniye Farki : "+saniyeFarki);


        Date ilkTarih2=new Date();
        Belge belge2 = genelEntityService.findBelgeById(2L);
        Date sonTarih2=new Date();

        long saniyeFarki2=getSaniyeFarki(ilkTarih2,sonTarih2);
        System.out.println(belge2);
        System.out.println("Saniye Farki : "+saniyeFarki2);


        Date ilkTarih3= new Date();
        Belge belgeClone=null;
        try {
            belgeClone = belge1.clone();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        Date sonTarih3=new Date();

        long saniyeFarki3=getSaniyeFarki(ilkTarih3,sonTarih3);

        belgeClone.setAdi("Günlük");
        belgeClone.setVeri("Sevgili Günlük");
        belgeClone.getKategori().setAdi("Kişisel 2");
        System.out.println(belgeClone);
        System.out.println("Saniye Farki :"+saniyeFarki3);

        System.out.println(belge1);


    }

    private static long getSaniyeFarki(Date ilkTarih, Date sonTarih) {
        long hassasiyet =1000;
        long saniyeFarki=(sonTarih.getTime()/hassasiyet)-(ilkTarih.getTime()/hassasiyet);
        return saniyeFarki;
    }
}
