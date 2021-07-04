package structural.bridge;

public class App {
    public static void main(String[] args) {
        Muzik muzik = new Muzik("Sezan aksu - Gülümse","Gülümse hadi gülümse");
        Bilgisayar bilgisayar = new Bilgisayar();
        bilgisayar.muzikCal(muzik);
    }
}
