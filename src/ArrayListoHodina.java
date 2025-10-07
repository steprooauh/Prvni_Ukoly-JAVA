import java.util.ArrayList;
import java.util.List;

public class ArrayListoHodina {
    public static void HodinaArray() {
        ArrayList<String> superarraylistecek = new ArrayList<>(); //vytvoreni array
        superarraylistecek.add("Beja");
        superarraylistecek.add("Terka");
        superarraylistecek.add("Nika");
        superarraylistecek.add("Meisha");
        superarraylistecek.add("Mája");
        superarraylistecek.add("Marky");

        System.out.println("Slay lidi na světě: " + superarraylistecek);

        System.out.println("Počet lidí: " + superarraylistecek.size());

        System.out.println("První: " + superarraylistecek.getFirst());

        System.out.println("Poslední: " + superarraylistecek.getLast());

        superarraylistecek.remove("Nika");
        superarraylistecek.remove(1);

        System.out.println();

        System.out.println("Po zlikvidování zůstali: " + superarraylistecek);

        superarraylistecek.clear();

        System.out.println("Po hromadném zlikvidování zůstali: " + superarraylistecek);

    }

    public static void HodinaArray2() {
        ArrayList<String> zvirata = new ArrayList<>(List.of("Pes", "Kočka", "Papoušek", "Kráva", "Ovce", "Anakunda", "Žirafa", "Ptakopysk Pery", "Křeček"));

        zvirata.addAll(List.of("Morče", "Zmije", "Netopýr", "Lev", "Slon"));

        for (String zvire : zvirata) {
            System.out.println(zvire);
        }
    }

    public static void HodinaArray3() {
        ArrayList<Integer> cisla = new ArrayList<>(List.of(50,60,70,80,90,100,101,123,564,849,561,546,84,516,654,846,516,648,9545459,252,9525,516,6,846,156,156,546,465,546,132));
        cisla.addAll(List.of(546,564,89,564,1551,456486,156,546,846,51,123,654,46546,546));

        System.out.println("Seznam cisel: ");
        for (int c : cisla) {
            System.out.println(c);
        }

        System.out.println("---------------------------------------------");
        int max = cisla.getFirst();
        for (int c : cisla){
            if (c >max){
                max = c;
            }
        }
        System.out.println("Maximiliánní číslo: "+max);

        //soucet
        int soucet = 0;
        for (int c : cisla){
            soucet += c;
        }
        System.out.println("Součet všech čísel je: "+soucet);
        System.out.println("Počet čísel v seznamu: "+cisla.size());
        System.out.println("Průměrné číslo: " + ((double)soucet / cisla.size()));
    }
}
