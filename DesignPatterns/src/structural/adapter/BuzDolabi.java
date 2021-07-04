package structural.adapter;

public class BuzDolabi implements ElektrikliEvAletleri{
    private int volt;

    public BuzDolabi() {
        this.volt=220;
    }

    @Override
    public int prizeTakVeCalistir() {
        System.out.println("Buzdolabi Calisiyor.");
        return volt;
    }
}
