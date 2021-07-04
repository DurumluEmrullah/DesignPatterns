package creational.prototype;

public class GenelEntityService {

    public BelgeTuru findBelgeTuruById(Long id){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        BelgeTuru belgeTuru = new BelgeTuru();
        belgeTuru.setId(id);

        String adi;
        if(id.compareTo(1L)==0){
            adi = "kişisel";
        }
        else if (id.compareTo(2L)==0){
            adi="kurumsal";
        }
        else {
            adi="genel";
        }

        belgeTuru.setAdi(adi);
        return belgeTuru;
    }

    public Kategori findKategoriById(Long id){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Kategori kategori = new Kategori();
        kategori.setId(id);

        String adi;
        if(id.compareTo(1L)==0){
            adi = "özel";
        }
        else if (id.compareTo(2L)==0){
            adi="iş";
        }
        else {
            adi="genel";
        }

        kategori.setAdi(adi);
        return kategori;
    }

    public Belge findBelgeById(Long id){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Belge belge = new Belge();
        belge.setId(id);
        belge.setBelgeTuru(findBelgeTuruById(id));
        belge.setKategori(findKategoriById(id));


        String adi;
        String veri;
        if(id.compareTo(1L)==0){
            adi = "Mektup";
            veri="Sevgili dostum ahmet";
        }
        else if (id.compareTo(2L)==0){
            adi="rapor";
            veri="Bu rapor genel müdüre verilmek üzere hazırlanmıştır.";
        }
        else {
            adi="Trafik Kuralları";
            veri="Sağa dönüşte yayaya yol ver";
        }

        belge.setAdi(adi);
        belge.setVeri(veri);
        return belge;
    }





}
