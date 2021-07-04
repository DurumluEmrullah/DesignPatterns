package structural.bridge.bridgeSon.cihaz;

import structural.bridge.bridgeSon.Muzik;
import structural.bridge.bridgeSon.muzikCalar.MuzikCalar;
import structural.bridge.bridgeSon.sesCihazi.SesCihazi;

public abstract class MuzikCalabilenBilgisayar {

    protected SesCihazi sesCihazi;
    protected MuzikCalar muzikCalar;

    public MuzikCalabilenBilgisayar() {
    }

    public MuzikCalabilenBilgisayar(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        this.sesCihazi = sesCihazi;
        this.muzikCalar = muzikCalar;
    }
    public void muzikCal(Muzik muzik){
        String ses=muzikCalar.muzikCal(muzik);
        sesCihazi.sesiCal(ses);

    }
}
