package structural.bridge.bridgeSon;


import structural.bridge.bridgeSon.cihaz.BilgisayarKulaklikVeFizy;
import structural.bridge.bridgeSon.cihaz.Telefon;
import structural.bridge.bridgeSon.muzikCalar.Fizy;
import structural.bridge.bridgeSon.muzikCalar.Spotify;
import structural.bridge.bridgeSon.sesCihazi.Hoparlor;
import structural.bridge.bridgeSon.sesCihazi.Kulaklik;

/**
 * @author Emrullah Durumlu
 * <ol>
 *     <li>Genişlemeyi önlemek için soyutlamaya gider</li>
 * </ol>
 */

public class App {
    public static void main(String[] args) {
        Muzik muzik = new Muzik("Sezan aksu - Gülümse","Gülümse hadi gülümse");
        BilgisayarKulaklikVeFizy bilgisayarKulaklikVeFizy=new BilgisayarKulaklikVeFizy();

        bilgisayarKulaklikVeFizy.muzikCal(muzik);

        System.out.println("************************************");

        Telefon telefon=new Telefon(new Hoparlor(),new Spotify());
        telefon.muzikCal(muzik);

        System.out.println("************************************");

        Telefon telefon2=new Telefon(new Kulaklik(),new Fizy());
        telefon2.muzikCal(muzik);
    }
}
