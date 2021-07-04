package structural.bridgeSon;


import structural.bridgeSon.cihaz.BilgisayarKulaklikVeFizy;
import structural.bridgeSon.cihaz.Telefon;
import structural.bridgeSon.muzikCalar.Fizy;
import structural.bridgeSon.muzikCalar.Spotify;
import structural.bridgeSon.sesCihazi.Hoparlor;
import structural.bridgeSon.sesCihazi.Kulaklik;

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
