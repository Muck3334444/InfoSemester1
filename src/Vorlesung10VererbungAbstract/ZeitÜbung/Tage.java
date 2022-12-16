package Vorlesung10VererbungAbstract.ZeitÜbung;

public class Tage extends Zeit{
    private Stunde stunden;

    public Stunde getStunden() {
        return stunden;
    }

    public void setStunden(Stunde stunden) {
        this.stunden = stunden;
    }

    public Tage(Stunde stunden) {
        this.stunden = stunden;
    }
}
