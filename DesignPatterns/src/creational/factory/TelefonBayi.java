package creational.factory;

public class TelefonBayi {

    public static void main(String[] args) {

        Telefon telefon=TelefonFabrikası.getTelefon("S8","2600mAh",4,7);
        Telefon telefon2=TelefonFabrikası.getTelefon("Note8","2600mAh",4,7);

        System.out.println("S8 için telefon özellikleri:");
        System.out.println(telefon);
        System.out.println("Note 8 için telefon özellikleri:");
        System.out.println(telefon2);

    }
}
