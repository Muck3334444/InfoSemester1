package Vorlesung9;

public class AuftragsVerwaltung {
    public static void main(String[] args) {
        Artikel artikel1 = new Artikel(25);
        Artikel artikel2 = new Artikel(50);
        Artikel artikel3 = new Artikel(250);
        Artikel artikel4 = new Artikel(7);
        Auftrag auftrag1 = new Auftrag(artikel1, 7);
        Auftrag auftrag2 = new Auftrag(artikel3, 2);
        Auftrag auftrag3 = new Auftrag(artikel2, 23);
        Auftrag auftrag4 = new Auftrag(artikel4, 2);
        System.out.println(Auftrag.getGesamtWert(auftrag1,auftrag2,auftrag3,auftrag4));
    }
}
