package structural.adapter;

public class Test {
    public static void main(String[] args) {
        Priz priz = new Priz();

        Utu utu = new Utu();
        BuzDolabi buzDolabi=new BuzDolabi();

        priz.elektrikVer(utu);
        System.out.println();
        priz.elektrikVer(buzDolabi);



        IphoneTelefon iphoneTelefon=new IphoneTelefon();
        TelefonEEAAdapter telefonEEAAdapter = new TelefonEEAAdapter(iphoneTelefon);
        priz.elektrikVer(telefonEEAAdapter);


    }
}
