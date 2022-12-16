package Vorlesung10VererbungAbstract.AngestellteÜbung;

public abstract class Mitarbeiter {
    protected String nachname, vorname;
    protected double gehalt;

    public Mitarbeiter(String nachname, String vorname, double gehalt) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.gehalt = gehalt;
    }

    /**
     * Erhöht das Gehalt um den Betrag
     * @param betrag
     */
    public void erhoeheGehalt(double betrag){
        gehalt += betrag;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "nachname='" + nachname + '\'' +
                ", vorname='" + vorname + '\'' +
                ", gehalt=" + gehalt +
                '}';
    }

    public abstract void addZulage(double betrag);
}
