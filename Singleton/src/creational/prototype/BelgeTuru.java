package creational.prototype;

/**
 * @author Emrullah Durumlu
 * @since 1.0.0
 *
 */
public class BelgeTuru  implements Cloneable{

    private long id;
    private String adi;

    public BelgeTuru(){
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
    protected BelgeTuru clone() throws CloneNotSupportedException {
        return (BelgeTuru) super.clone();
    }
}
