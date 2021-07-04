package creational.factory;

public class TelefonFabrikası {

    public static Telefon getTelefon(String model,String batarya,int en,int boy){
        if(model.equalsIgnoreCase("S8")){
            return new S8(model, batarya, en, boy);
        }
        else if(model.equalsIgnoreCase("Note8")){
            return new Note8(model, batarya, en, boy);
        }
        else {
            throw new RuntimeException("Böyle bir model mevcut değil");
        }

    }
}
