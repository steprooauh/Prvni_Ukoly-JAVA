import java.util.ArrayList;
import java.util.List;

/*
Zadání:

Napiš program v Javě, který:

Zapište do programu tyto body [24, 29, 22, 31, 30, 27, 25, 21, 28, 20, 18, 15, 14, 10, 12, 26, 32, 23, 19, 27, 16, 18, 15, 24, 23, 31, 10, 27, 5, 29]

Vypočítá procentuální hodnocení (například 78 %).

Podle procentuálního hodnocení přiřadí známku podle tohoto klíče:

90 % a více = 1

80 % až 89 % = 2

70 % až 79 % = 3

60 % až 69 % = 4

méně než 60 % = 5

Výsledek vypíše ve formátu:
1. dostal X bodů, tedy Y% a známka je Z (prospěl/neprospěl)

Poté odřádkuje a napíše:
Průměr třídy je X% nebo Y bodů.
*/
public class Znamky {

    public static void Znamky() {
        ArrayList<Integer> zn = new ArrayList<Integer>(List.of(24, 29, 22, 31, 30, 27, 25, 21, 28, 20, 18, 15, 14, 10, 12, 26, 32, 23, 19, 27, 16, 18, 15, 24, 23, 31, 10, 27, 5, 29));
        System.out.println("Test 1:");
        System.out.println("Výpis bodů: " + zn);

        ArrayList<Integer> proc = new ArrayList<Integer>();
        int maxBody = 30;

        for (int z : zn) {
            int procenta = (z * 100) / maxBody;
            proc.add(procenta);
        }
        System.out.println("Výpis procent: " + proc);

        ArrayList<Integer> znamky = new ArrayList<Integer>();
        ArrayList<String> pr = new ArrayList<String>();

        // Určení známky a zda student prospěl/neprospěl
        for (int z : proc) {
            int znamka = 0;
            if (z >= 90) {
                znamka = 1;
            } else if (z >= 80) {
                znamka = 2;
            } else if (z >= 70) {
                znamka = 3;
            } else if (z >= 60) {
                znamka = 4;
            } else {
                znamka = 5;
            }
            znamky.add(znamka);
//n
            String prospel = (znamka < 5) ? "prospěl" : "neprospěl";
            pr.add(prospel);
        }
        System.out.println("Výpis známek: " + znamky);

        int poradi = 1;
        for (int i = 0; i < zn.size(); i++) {
            System.out.println(poradi + ". dostal " + zn.get(i) + " bodů, tedy " + proc.get(i) + "% a známka je " + znamky.get(i) + " (" + pr.get(i) + ")");
            poradi++;
        }

        double prumerProc = 0;
        double prumerBodu = 0;
        for (int i = 0; i < zn.size(); i++) {
            prumerProc += proc.get(i);
            prumerBodu += zn.get(i);
        }
        prumerProc = prumerProc / zn.size();
        prumerBodu = prumerBodu / zn.size();

        System.out.printf("Průměr třídy je %.2f%% nebo %.2f bodů.%n", prumerProc, prumerBodu);
    }
}
