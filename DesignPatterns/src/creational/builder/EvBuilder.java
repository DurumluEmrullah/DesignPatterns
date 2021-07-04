package creational.builder;

public class EvBuilder {

    private String il;
    private String ilçe;
    private String mahalle;

    private int binaYili;
    private int odaSayisi;
    private int banyoSayisi;
    private int tuvaletSayisi;
    private int balkonSayisi;

    private boolean isDublex;
    private boolean isEsyali;
    private boolean hasOtopark;
    private boolean hasCocukParki;
    private boolean hasKlima;
    private boolean hasHavuz;

    public static EvBuilder startNormalEvBuild(String il,String ilçe,String mahalle,int binaYili,int odaSayisi){
        EvBuilder evBuilder = new EvBuilder();
        evBuilder.il=il;
        evBuilder.ilçe=ilçe;
        evBuilder.mahalle=mahalle;
        evBuilder.binaYili=binaYili;
        evBuilder.odaSayisi=odaSayisi;
        return evBuilder;
    }

    public static EvBuilder startHavuzluEvBuild(String il,String ilçe,String mahalle,int binaYili,int odaSayisi){
        EvBuilder evBuilder = new EvBuilder();
        evBuilder.il=il;
        evBuilder.ilçe=ilçe;
        evBuilder.mahalle=mahalle;
        evBuilder.binaYili=binaYili;
        evBuilder.odaSayisi=odaSayisi;
        evBuilder.hasHavuz=true;
        return evBuilder;
    }

    public Ev build(){
        Ev ev = new Ev();
        ev.setIl(il);
        ev.setIlçe(ilçe);
        ev.setMahalle(mahalle);

        ev.setBinaYili(binaYili);
        ev.setOdaSayisi(odaSayisi);
        ev.setBanyoSayisi(banyoSayisi);
        ev.setTuvaletSayisi(tuvaletSayisi);
        ev.setBalkonSayisi(balkonSayisi);

        ev.setDublex(isDublex);
        ev.setEsyali(isEsyali);
        ev.setHasOtopark(hasOtopark);
        ev.setHasCocukParki(hasCocukParki);
        ev.setHasKlima(hasKlima);
        ev.setHasHavuz(hasHavuz);
        return ev;
    }



    public EvBuilder setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
        return this;
    }

    public EvBuilder setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
        return this;
    }

    public EvBuilder setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
        return this;
    }

    public EvBuilder setDublex(boolean dublex) {
        isDublex = dublex;
        return this;
    }

    public EvBuilder setEsyali(boolean esyali) {
        isEsyali = esyali;
        return this;
    }

    public EvBuilder setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
        return this;
    }

    public EvBuilder setHasCocukParki(boolean hasCocukParki) {
        this.hasCocukParki = hasCocukParki;
        return this;
    }

    public EvBuilder setHasKlima(boolean hasKlima) {
        this.hasKlima = hasKlima;
        return this;
    }

    public EvBuilder setHasHavuz(boolean hasHavuz) {
        this.hasHavuz = hasHavuz;
        return this;
    }
}
