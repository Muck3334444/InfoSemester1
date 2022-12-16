package Vorlesung10VererbungAbstract.AngestellteÜbung;

public class MitarbeiterVerwaltung {
    public static void main(String[] args) {
        Angestellter angestellter = new Angestellter("Mustermann", "Max",3500);
        Azubi azubi = new Azubi("Musterfrau", "Mia", 1120);
        System.out.println("---------------------------------\nAngestellter:\n\n");
        angestellter.zeigeDaten();
        angestellter.erhoeheGehalt(200);
        angestellter.zeigeDaten();
        angestellter.addZulage(500);
        angestellter.zeigeDaten();
        angestellter.befoerdere();
        angestellter.befoerdere();
        angestellter.addZulage(500);
        angestellter.zeigeDaten();
        System.out.println("\n\n---------------------------------\nAzubi:\n\n");
        azubi.zeigeDaten();
        azubi.addZulage(200);
        azubi.zeigeDaten();
        azubi.SetPruefungen(4);
        azubi.addZulage(500);
        azubi.zeigeDaten();
    }
}
