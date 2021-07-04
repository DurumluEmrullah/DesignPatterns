package structural.bridgeSon.cihaz;

import structural.bridgeSon.Muzik;
import structural.bridgeSon.muzikCalar.MuzikCalar;
import structural.bridgeSon.muzikCalar.Spotify;
import structural.bridgeSon.sesCihazi.Hoparlor;
import structural.bridgeSon.sesCihazi.SesCihazi;

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
