package Vorlesung10.ZeichnenÜbung;

public class TestFigur {
    public static void main(String[] args) {
        Figur[] figuren = new Figur[2];
        figuren[0] = new Kreis(2);
        figuren[1] = new Rechteck(4,5);
        System.out.println("Kreis Flaeche: " + figuren[0].getFlaeche());
        System.out.println("Rechteck Flaeche: " + figuren[1].getFlaeche());
        figuren[0].zeichne();
        figuren[1].zeichne();
    }
}
