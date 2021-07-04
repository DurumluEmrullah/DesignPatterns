package creational.singleton;

public class Singleton{

  // Eager loading
//    public static creational.Singleton.creational.Singleton singleton = new creational.Singleton.creational.Singleton();

    public static Singleton singleton;

    private Singleton(){
        System.out.println("ben oluştum");

    }


    public static Singleton getInstance(){


        // Double Checked Locking kalıbı
        if(singleton == null){
            // Threade Safe
            synchronized (Singleton.class){
                //lazy loading
                if(singleton ==null){
                    singleton=new Singleton();
                }
            }
        }

        return singleton;
    }
}
