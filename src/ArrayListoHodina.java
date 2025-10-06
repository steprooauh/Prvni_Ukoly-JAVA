import java.util.ArrayList;
import java.util.List;

public class ArrayListoHodina {
    public static void HodinaArray() {
        ArrayList<String> superarraylistecek = new ArrayList<>(); //vytvoreni array
        superarraylistecek.add("Beja");
        superarraylistecek.add("Terka");
        superarraylistecek.add("Nika");
        superarraylistecek.add("Meisha"); //pridani komponentu

        System.out.println("Slay lidi na světě: " + superarraylistecek); //vypise (Slay lidi na světě: Beja Terka Nika Meisha

        System.out.println("Počet lidí: " + superarraylistecek.size()); // size = napíše počet komponentů ; vypise Počet lidí: 4

        System.out.println("První: " + superarraylistecek.getFirst()); //vypíše první komponent v listu

        System.out.println("Poslední: " + superarraylistecek.getLast()); //vypíše poslední komponent v listu

        superarraylistecek.remove("Nika"); //smaze komponent Nika
        superarraylistecek.remove(1); //smaze 2 komponent (0 je první)

        System.out.println(); //vypíše nic

        System.out.println("Po zlikvidování zůstali: " + superarraylistecek); //vypise Po zlikvidování zůstali Beja ...

        superarraylistecek.clear(); //vyprázní celý list

        System.out.println("Po hromadném zlikvidování zůstali: " + superarraylistecek); //vypíše Po hromadném zlikvidování zůstali: nic protože je to smazané

    }

    public static void HodinaArray2() {
        ArrayList<String> zvirata = new ArrayList<>(List.of("Pes", "Kočka", "Papoušek", "Kráva", "Ovce", "Anakunda", "Žirafa", "Ptakopysk Pery", "Křeček"));

        zvirata.addAll(List.of("Morče", "Zmije", "Netopýr", "Lev", "Slon"));

        System.out.println(zvirata);
    }
}
