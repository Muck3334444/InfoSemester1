package Vorlesung10;

public class LebewesenVerwaltung {
    public static void main(String[] args) {
        Hund hund = new Hund("Wolf","Wald",20, false);
        Fisch fisch = new Fisch("Hai", "Meer", 35, false);
        Dino dino = new Dino("Rex", "Urzeit Savane", 25, true);
        hund.exist();
        fisch.exist();
        dino.exist();
        hund.movement();
        fisch.movement();
        dino.movement();
    }
}
