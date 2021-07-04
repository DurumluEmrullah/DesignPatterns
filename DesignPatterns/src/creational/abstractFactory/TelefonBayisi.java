package creational.abstractFactory;

public class TelefonBayisi {

    public static void main(String[] args) {
        S8Factory s8Factory = new S8Factory();
        Telefon s8=s8Factory.getTelefon("s8","3000mAh",4,8);

        Note8Factory note8Factory = new Note8Factory();
        Telefon note8=note8Factory.getTelefon("Note8","4200mAh",5,9);

        System.out.println("S8 Özellikleri:");
        System.out.println(s8);

        System.out.println("Note 8 Özellikleri:");
        System.out.println(note8);
    }
}
