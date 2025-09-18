//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pisen pisen1 = new Pisen("Vysoký Jalovec", "C:/music/vysokyjalovec.mp3", "Moravanka",
                4, 1972, "1989", false, 29.99);

        System.out.println("Program ROZPOZNEJ PÍSEŇ!");
        System.out.println("by: Štěpán Prokop");
        System.out.println();
        pisen1.vypisInfo();

    }
}