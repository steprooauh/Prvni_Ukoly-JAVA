import java.util.Random;

public class Cykly {

    public static void vypisCisla15(){
        int cisla = 0;
        for (int i = 0; i <15; i++) {
            cisla = cisla + 1;
            System.out.println("Číslo: "+cisla);
        }
    }

    public static void nahodneCisla() {
        Random random = new Random();
        int pocetMensi50 = 0;

        System.out.println("Náhodné čísla nad 50: ");
        for (int i = 0; i < 40; i++) {
            int cislo = random.nextInt(100);
            if (cislo >= 50)
            {
                System.out.print(cislo+" ");
            } else {
                pocetMensi50++;
            }
        }
        System.out.println();
        System.out.println("Počet menších čísel než 50: "+pocetMensi50);
    }

    public static void ukol1() {
        int cislo = 20;
        for (int i = 0; i < 20; i++) {
            cislo = cislo + 1;
            System.out.print(cislo + " ");
        }
    }

    public static void ukol2() {
        Random rand = new Random();
        int cisloSude = 0;
        int cisloLiche = 0;

        for (int i = 0; i < 30; i++) {
            int cislo = rand.nextInt(50);
            if (cislo < 1) {
                cislo = cislo +1;
            }
            if (cislo % 2 == 0){
                System.out.println(cislo+" je sudé");
                cisloSude++;
            } else {
                System.out.println(cislo+" je liché");
                cisloLiche++;
            }
        }
        System.out.println("Tolik bylo čísel sudých "+cisloSude+" tolik bylo čísel lichých "+cisloLiche+".");
    }
}
