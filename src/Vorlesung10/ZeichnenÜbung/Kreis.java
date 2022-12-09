package Vorlesung10.ZeichnenÜbung;

public class Kreis extends Figur {
    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void zeichne() {
        System.out.println("O");
    }

    @Override
    public double getFlaeche() {
        return Math.PI * radius * radius;
    }
}
