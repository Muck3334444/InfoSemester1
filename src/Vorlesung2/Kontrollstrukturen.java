package Vorlesung2;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Kontrollstrukturen {
    public static void main(String[] args) {
        //ifClauses();
        schleifen();
    }

    private static void ifClauses(){
        Scanner scanner = new Scanner(System.in);
        int kontoStand = scanner.nextInt();
        if (kontoStand > 0){
            System.out.println("Kontostand ist positiv");
        } else if (kontoStand == 0) {
            System.out.println("Konto Leer");
        } else{
            System.out.println("Insolvent");
        }
        boolean b = false;
        if (b = true){ // Wertzuweisung
            System.out.println("b hat den Wert true");
        }
        String wochentag = "Mittwoch";
        System.out.println(switch (wochentag){
                case "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag" -> "Wochentag";
                case "Samstag", "Sonntag" -> "Wochenende";
            default -> "Das ist aber eine komische eingabe";
        } );
        String monat = "Januar";
        System.out.println(switch (monat){
            case "Januar", "März", "Mai", "Juli", "August","Oktober","Dezember" -> "31 Tage";
            case "April", "Juni","September","November" -> "30 Tage";
            case "Februar" -> "28 Tage";
            default -> "Das ist aber eine komische Eingabe";
        } );
    }

    private static void schleifen(){
        for (int i = 0; i < 50; i++){
            System.out.println(i * i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 97; i < 123; i++){
            System.out.println((char)i);
        }
        for (int i = 0; i < 21; i++) {
            if (i != 13){
                System.out.println(i);
            }
        }
        int a = 3;
        do {
            a--;
            System.out.println(a);
        }while(a > 0);
        while(a != 7){
            a++;
            System.out.println(a);
        }
        Scanner scanner = new Scanner(System.in);
        int kontostand = scanner.nextInt();
        int produktPreis = scanner.nextInt();
        int produktAnzahl = 0;
        while(kontostand > 0){
            kontostand = kontostand - produktPreis;
            produktAnzahl++;
            System.out.println(kontostand + "€   " + produktAnzahl + " Produkte");
        }
        int r = 0;
        Random random = new Random();
        do {
            r = random.nextInt(1,7);
            System.out.println(r);
        }while(r != 6);
        do {
            r = random.nextInt(1,101);
            System.out.println(r);
        }while(r != 13);
        String ausgabe = "";
        for (int i = 1; i <= 10; i++) {
            ausgabe = "";
            for (int j = 1; j <=  10; j++) {
                ausgabe += i * j + " ";
            }
            System.out.println(ausgabe);
        }
        int h = 10;
        int b = 5;
        int maxWidth = b * h;
        for (int i = 1; i <= h; i++) {
            for (int j = 0; j < maxWidth - i * b; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * b; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
