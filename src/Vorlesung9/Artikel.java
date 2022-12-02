package Vorlesung9;

public class Artikel {
    private int id;
    private double preis;
    private int lastArtikelId = 0;

    public Artikel( double preis) {
        this.id = lastArtikelId++;
        this.preis = preis;
    }

    public int getId() { return id; }

    public double getPreis() { return preis; }

    public void setPreis(double preis) { this.preis = preis; }
}
