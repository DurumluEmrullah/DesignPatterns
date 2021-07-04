package structural.bridgeSon.muzikCalar;

import structural.bridgeSon.Muzik;

public class Spotify implements MuzikCalar{
    @Override
    public String muzikCal(Muzik muzik) {
        System.out.println("Fizy "+muzik+ " sarkisini caliyor.");
        return muzik.getSes();
    }
}
