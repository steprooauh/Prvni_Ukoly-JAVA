import java.util.*;

public class ArrayListUkol {
    public static void Ukol1(){
        //cast1
        ArrayList<Integer> cisla = new ArrayList<>(List.of(1,2,3,4,5));
        //cast2
        System.out.println("Seznam známek: ");
        for (int c : cisla){
            System.out.print(c+" ");
        }
        System.out.println();
        //cast3
        System.out.println("Počet známek: "+cisla.size());
        int min = 0;
        for (int c : cisla){
            if (min < c){
                min = c;
            }
        }
        System.out.println("Nejlepší známka: "+min);
        int max = 0;
        for (int c : cisla){
            if (max > c){
                max = c;
            }
        }
        System.out.println("Nejhorší známka: "+max);
        //cast4
        int soucet = 0;
        for (int c : cisla){
            soucet += c;
        }
        System.out.println("Součet: "+soucet);

        System.out.println("Průměr: "+((double) soucet / cisla.size()));

        //cast5
        cisla.add(3);
        cisla.remove(4);
        System.out.println("Nový seznam známek: ");
        for (int c : cisla){
            System.out.print(c+" ");
        }
        System.out.println();
        //bonus
        int kolikJednicek = 0;
        for (int c : cisla){
            if (c == 1){
                kolikJednicek++;
            }
        }
        System.out.println("Tolik jedniček bylo v písemce: "+kolikJednicek);

        int kolikLepsi = 0;
        for (int c : cisla){
            if ((soucet / cisla.size()) < c){
                kolikLepsi++;
            }
        }
        System.out.println("Tolik bylo lepší než průměr: "+kolikLepsi);

        Collections.reverse(cisla);

        System.out.print("Vzestupně: ");
        for (int c : cisla){
            System.out.print(c+" ");

        }
        System.out.println();

    }

    public static void Ukol2() {
        ArrayList<Integer> cisla = new ArrayList<>(List.of(85, 40, 67, 90, 100, 55, 76, 30, 95, 60));

        System.out.println("Seznam cisel: ");
        for (int c : cisla) {
            System.out.print(c + " ");
        }

        int max = 0;
        for (int c : cisla) {
            if (c > max) {
                max = c;
            }
        }
        System.out.println("Nejvyšší: " + max);

        int min = 0;
        for (int c : cisla) {
            if (c < min) {
                min = c;
            }
        }
        System.out.println("Nejnižší: " + min);

        int soucet = 0;
        for (int c : cisla) {
            soucet += c;
        }
        System.out.println("Součet: " + soucet);

        System.out.println("Průměr: " + ((double) soucet / cisla.size()));

        int proslo = 0;
        for (int c : cisla) {
            if (c > 50) {
                proslo++;
            }
        }
        System.out.println("Prošlo: " + proslo + " a neprošlo: " + (cisla.size() - proslo));

        Collections.reverse(cisla);
        for (int c : cisla) {
            System.out.print(c + " ");
        }
        Collections.sort(cisla);
        for (int c : cisla) {
            System.out.print(c + " ");
        }

        double median;
        if (cisla.size() % 2 == 1) {
            median = cisla.get(cisla.size() / 2);
        } else {
            int middle1 = cisla.get(cisla.size() / 2 - 1);
            int middle2 = cisla.get(cisla.size() / 2);
            median = (middle1 + middle2) / 2.0;
        }
        System.out.println("Median: "+median);

        cisla.remove((Integer) Integer.MIN_VALUE);
        cisla.remove((Integer) Integer.MAX_VALUE);

        System.out.println("Seznam bez nejhoršího a nejlepšího výsledku:");
        for (int c : cisla) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void Ukol3() {
        ArrayList<Integer> znamky = new ArrayList<>(List.of(1, 1, 3, 4, 5, 2, 2, 1, 2, 3, 4, 1, 5, 1, 2, 3, 1, 4, 5, 5));
        Scanner sc = new Scanner(System.in);

        System.out.println("Známky: " + znamky);

        int soucet = 0;
        int proslo = 0;
        int neproslo = 0;
        int min = 5;
        int max = 0;

        for (int i : znamky) {
            soucet += i;
            if (i <= 4) proslo++;
            if (i == 5) neproslo++;
            if (i < min) min = i;
            if (i > max) max = i;
        }

        System.out.println("Průměr: " + ((double) soucet / znamky.size()));
        System.out.println("Prošlo: " + proslo + " studentů");
        System.out.println("Neprošlo: " + neproslo + " studentů");
        System.out.println("Nejlepší známka: " + min);
        System.out.println("Nejhorší známka: " + max);

        System.out.println("Zapsat známku? A/N");
        String ano = sc.nextLine().trim();

        if (ano.equalsIgnoreCase("A")) {
            System.out.println("Vpiště známku (1-5)");
            int znamka = Integer.parseInt(sc.nextLine());
            if (znamka < 1 || znamka > 5) {
                System.out.println("Špatně zadaná známka! Chyba");
            } else {
                znamky.add(znamka);
                System.out.println("Aktualizovaný seznam známek: " + znamky);
                // Volitelně: vypočítej statistiky znovu
            }
        }
    }
}
