package creational.prototype;

public class Kategori implements Cloneable{

    private long id;
    private String adi;

    public Kategori() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        return adi;
    }

    @Override
    protected Kategori clone() throws CloneNotSupportedException {
        return (Kategori) super.clone();
    }
}
