package Vorlesung11Interfaces.Obstlagerung;

public class Obstlager {
    public static void main(String[] args) {
        Obst[] obstlager = {new Apfel(), new Birne(), new Orange()};
        print(obstlager);

    }

    public static void print(Obst[] obstInLager){
        for (Obst obst : obstInLager) {
            System.out.println(obst.getName() + " ist " + obst.getFarbe() + " farben");
        }
    }
}
