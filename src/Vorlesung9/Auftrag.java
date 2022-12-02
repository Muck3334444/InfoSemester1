package Vorlesung9;
public class Auftrag {
    private Artikel artikel;
    private int menge;
    public Auftrag(Artikel artikel, int menge){
        this.artikel = artikel;
        this.menge = menge;
    }
    public int getMenge() { return menge; }
    public Artikel getArtikel() { return artikel; }
    public void setArtikel(Artikel artikel) { this.artikel = artikel;}
    public void setMenge(int menge) { this.menge = menge;}

    public static double getGesamtWert(Auftrag ... auftraege){
        double preis = 0;
        for (Auftrag auftrag: auftraege) {
            preis += auftrag.getMenge() * auftrag.getArtikel().getPreis();
            System.out.println(preis);
        }
        return preis;
    }
}
