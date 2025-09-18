public class Pisen {
    String nazev;
    String cestaKSouboru;
    String nazevInterpreta;
    int pocetClenu;
    int rokZalozeniKapely;
    String datumVydani;
    boolean jePlacena;
    double cena;

    public Pisen(String nazev, String cestaKSouboru, String nazevInterpreta, int pocetClenu, int rokZalozeniKapely, String datumVydani,
                 boolean jePlacena, double cena){
        this.nazev =  nazev;
        this.cestaKSouboru = cestaKSouboru;
        this.nazevInterpreta = nazevInterpreta;
        this.pocetClenu = pocetClenu;
        this.rokZalozeniKapely = rokZalozeniKapely;
        this.datumVydani = datumVydani;
        this.jePlacena = jePlacena;
        this.cena = cena;
    }

    public void vypisInfo() {
        System.out.println("Název: " +nazev);
        System.out.println("Cesta k souboru: "+cestaKSouboru);
        System.out.println("Název interpreta: "+nazevInterpreta);
        System.out.println("Počet členů: "+pocetClenu);
        System.out.println("Rok založení kapely: "+rokZalozeniKapely);
        System.out.println("Datum vydání: "+datumVydani);
        System.out.println("Je placená? "+(jePlacena? "Ano" : "Ne"));
        System.out.println("Cena skladby: "+cena+" Kč");
    }

    public String getNazev() {
        return nazev;
    }

    public String getNazevInterpreta() {
        return nazevInterpreta;
    }

    public String getDatumVydani() {
        return datumVydani;
    }

    public void zmenaData(String noveDatum) {
        this.datumVydani = noveDatum;
    }
}
