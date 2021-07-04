package structural.bridge.bridgeSon.cihaz;

import structural.bridge.bridgeSon.Muzik;
import structural.bridge.bridgeSon.muzikCalar.Fizy;
import structural.bridge.bridgeSon.sesCihazi.Kulaklik;

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
