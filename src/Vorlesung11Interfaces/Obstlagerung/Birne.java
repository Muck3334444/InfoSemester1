package Vorlesung11Interfaces.Obstlagerung;

public class Birne implements Obst{
    @Override
    public String getName() {
        return "Birne";
    }

    @Override
    public String getFarbe() {
        return "Grün";
    }
}
