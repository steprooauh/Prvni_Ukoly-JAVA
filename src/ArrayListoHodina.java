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

        System.out.println(zvirata);
    }
}
