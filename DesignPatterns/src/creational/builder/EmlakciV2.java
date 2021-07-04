package creational.builder;

/**
 *
 * @author Emrullah Durumlu
 * <ol>
 *     <li>Belli bir kalıp oluşturmaya olanak tanır.</li>
 *     <li>Constructerlara isim vermemize olanak tanır.</li>
 *     <li>Kod okunabilirliğini arttırır.</li>
 *     <li>Gereksiz parametreleri boş geçmemize yarar.</li>
 *     <li>Nesneyi kararlı bir duruma getirir.</li>
 *     <li>Esnekliği sağlar.</li>
 *     <li>Consturucter ve statik fabrikaların parametrelerinin bir çoğu isteğe bağlıysa ve bir çoğu aynı türde ise iyi bir seçimdir -"Efektif java"</li>
 * </ol>
 */
public class EmlakciV2 {
    public static void main(String[] args) {


        Ev ev1 = EvBuilder.startNormalEvBuild("İstanbul","Bağcılar","Yuzyil",2010,3)
                .setHasCocukParki(false)
                .setHasOtopark(false)
                .build();

        printEv(ev1);

        Ev ev2 = EvBuilder.startHavuzluEvBuild("İstanbul","Esenler","Adem Yavuz",2010,4)
                .setBalkonSayisi(1)
                .setHasCocukParki(true)
                .build();

        printEv(ev2);
    }
    private static void printEv(Ev ev){
        System.out.println();
        System.out.println("Ev eklendi "+ev);
    }
}
