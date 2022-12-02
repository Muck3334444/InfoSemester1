package Vorlesung9;

public class PersonVerwaltung {

    public static void main(String[] args) {
        /*
        Person person1 = new Person();
        Person person2 = new Person(24,176,"Beispiel Name", "Beispielstrasse in Beispielstadt");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        Person.heimatPlanet = "Jupiter";
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        */
        Beleg[] belege = new Beleg[15];
        for (int i = 0; i < belege.length; i++) {
            belege[i] = new Beleg();
        }
        for (Beleg beleg:belege) {
            System.out.println(beleg.getOid());
        }
    }
}

