package structural.bridge.bridgeSon.cihaz;

import structural.bridge.bridgeSon.Muzik;
import structural.bridge.bridgeSon.muzikCalar.MuzikCalar;
import structural.bridge.bridgeSon.sesCihazi.SesCihazi;

public class Telefon extends MuzikCalabilenBilgisayar{
    public Telefon(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        super(sesCihazi,muzikCalar);
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Telefon muzik caliyor.");
        super.muzikCal(muzik);
    }
}
