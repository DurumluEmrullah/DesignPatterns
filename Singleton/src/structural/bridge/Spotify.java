package structural.bridge;

public class Spotify {

    public String müzikCal(Muzik muzik){
        System.out.println("Spotify "+muzik+" sarkisini caliyor.");
        return muzik.getSes();
    }
}
