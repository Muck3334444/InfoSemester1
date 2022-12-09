package Vorlesung10.AngestellteÜbung;

public class Azubi extends Mitarbeiter{
    private int abgelegtePrüfungen;

    public Azubi(String nachname, String vorname, double gehalt) {
        super(nachname, vorname, gehalt);
    }

    public void SetPruefungen(int i){
        abgelegtePrüfungen = i;
    }

    @Override
    public void addZulage(double betrag) {
        if (abgelegtePrüfungen > 3) {
            erhoeheGehalt(betrag);
        }
    }
    public void zeigeDaten(){
        System.out.println(super.toString() + "\nAbgelegte Pruefungen: " + abgelegtePrüfungen);
    }
}
