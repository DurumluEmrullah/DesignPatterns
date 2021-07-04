package structural.adapter;

public class IphoneTelefon implements Telefon{

    private int volt;

    public IphoneTelefon() {
        this.volt=5;
    }

    @Override
    public int sarjet() {
        System.out.println("Telefon Calisiyor.");
        return volt;
    }
}
