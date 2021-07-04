package structural.bridge.bridgeSon.muzikCalar;

import structural.bridge.bridgeSon.Muzik;

public class Fizy implements MuzikCalar{
    @Override
    public String muzikCal(Muzik muzik) {
        System.out.println("Fizy "+muzik+ " sarkisini caliyor.");
        return muzik.getSes();
    }
}
