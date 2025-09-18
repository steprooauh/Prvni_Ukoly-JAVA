import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pisen pisen1 = new Pisen("Vysoký Jalovec", "C:/music/vysokyjalovec.mp3", "Moravanka",
                4, 1972, "1989", true, 29.99);

        Pisen pisen2 = new Pisen("Baby Said", "C:/music/babysaid.mp3", "Maneskin",
                4, 2015, "2023", false, 0);

        System.out.println("Program");
        System.out.println("by: Štěpán Prokop");
        System.out.println();

        System.out.println("Vyberte součást programu: ");
        System.out.println("1 = Výpis písně");
        System.out.println("2 = Oprava datumu");
        System.out.println("3 = Cykly");
        System.out.println("4 = Náhodné číslo");
        System.out.println("5 = Ukol 1");
        System.out.println("6 = Ukol 2");
        String mainMenu = sc.nextLine();

        if (mainMenu.equals("1"))
        {
            pisen1.vypisInfo();
            System.out.println();
            pisen2.vypisInfo();
            sc.close();
        } else if (mainMenu.equals("2")) {
            //bonusovy ukol
            System.out.println(pisen1.getNazev()+" ("+ pisen1.getNazevInterpreta()+", "+pisen1.getDatumVydani() + ")");
            System.out.println(pisen2.getNazev()+" ("+ pisen2.getNazevInterpreta()+", "+pisen2.getDatumVydani() + ")");
            String enter = sc.nextLine();

            //oprava pres kod
            pisen1.zmenaData("18.4.1958");
            pisen2.zmenaData("31.5.1854");
            System.out.println("Opravené datum: ");
            System.out.println(pisen1.getNazev()+" ("+ pisen1.getNazevInterpreta()+", "+pisen1.getDatumVydani() + ")");
            System.out.println(pisen2.getNazev()+" ("+ pisen2.getNazevInterpreta()+", "+pisen2.getDatumVydani() + ")");
            String enter2 = sc.nextLine();

            //oprava datumu vydání uživatelem
            System.out.println("Opravte datum vydání skladeb:");
            System.out.println("Pro první píseň:");
            String value1 = sc.nextLine();
            System.out.println("Pro druhou píseň:");
            String value2 = sc.nextLine();

            System.out.println(pisen1.getNazev()+" ("+ pisen1.getNazevInterpreta()+", "+value1 + ")");
            System.out.println(pisen2.getNazev()+" ("+ pisen2.getNazevInterpreta()+", "+value2 + ")");

        } else if (mainMenu.equals("3")) {
            Cykly.vypisCisla15();
        } else if (mainMenu.equals("4")) {
            Cykly.nahodneCisla();
        } else if (mainMenu.equals("5")) {
            Cykly.ukol1();
        } else if (mainMenu.equals("6")) {
            Cykly.ukol2();
        }
        System.out.println("Konec programu");
        sc.close();
    }
}