package structural.bridgeSon.cihaz;

import structural.bridgeSon.Muzik;
import structural.bridgeSon.muzikCalar.MuzikCalar;
import structural.bridgeSon.sesCihazi.SesCihazi;

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
