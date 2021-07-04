package structural.bridgeSon.cihaz;

import structural.bridgeSon.Muzik;
import structural.bridgeSon.muzikCalar.Fizy;
import structural.bridgeSon.sesCihazi.Kulaklik;

public class BilgisayarKulaklikVeFizy extends MuzikCalabilenBilgisayar{


    public BilgisayarKulaklikVeFizy(){
        sesCihazi=new Kulaklik();
        muzikCalar=new Fizy();;
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Bilgisayar Calisti.");
        super.muzikCal(muzik);
    }
}
