package Vorlesung10.ZeitÜbung;

public class Stunde extends Zeit{
    private int stunden;

    public Stunde(int stunden) {
        this.stunden = stunden;
    }

    public int getStunden() {
        return stunden;
    }

    public void setStunden(int stunden) {
        this.stunden = stunden;
    }
}
