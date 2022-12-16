package Vorlesung10VererbungAbstract.ZeichnenÜbung;

public class Rechteck extends Figur {
    private double width, height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rechteck(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rechteck(double size){
        this(size,size);
    }

    @Override
    public void zeichne() {
        System.out.println("|=|");
    }

    @Override
    public double getFlaeche() {
        return width * height;
    }
}
