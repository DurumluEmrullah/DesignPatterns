package creational.builder;

public class Emlakci {
    public static void main(String[] args) {

        Ev ev1= new Ev();
        ev1.setIl("İstanbul");
        ev1.setIlçe("Bağcılar");
        ev1.setMahalle("Yuzyil");
        ev1.setOdaSayisi(3);
        ev1.setHasKlima(true);
        ev1.setBinaYili(2000);

        printEv(ev1);

        Ev ev2 = new Ev("istanbul","esenler","Adem yavuz",1999,3,1,0,1,false,true,false,false,true,false);

        printEv(ev2);

    }

    private static void printEv(Ev ev){
        System.out.println();

        System.out.println("Ev eklendi "+ev);

    }
}
