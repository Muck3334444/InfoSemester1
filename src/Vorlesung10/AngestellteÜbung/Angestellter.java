package Vorlesung10.AngestellteÜbung;

public class Angestellter extends Mitarbeiter{
    private static final int MAX_STUFE = 5;
    private int stufe;

    public Angestellter(String nachname, String vorname, double gehalt) {
        super(nachname, vorname, gehalt);
    }

    public void befoerdere(){
        if (stufe < MAX_STUFE){
            stufe++;
        }
    }

    @Override
    public void addZulage(double betrag) {
        if (stufe > 1) {
            erhoeheGehalt(betrag);
        }
    }

    public void zeigeDaten(){
        System.out.println(super.toString() + "\nStufe: " + stufe);
    }
}
