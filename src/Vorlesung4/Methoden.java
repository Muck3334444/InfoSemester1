package Vorlesung4;

import java.util.Scanner;

public class Methoden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        increaseBalance(50, scanner.next());
        increaseBalance(250, scanner.next());
        increaseBalance(1000, scanner.next());
        increaseBalance(10000, scanner.next());
    }

    private static void increaseBalance(double startMoney, String name){
        System.out.println("In the first year " + name + " has in the beginning " +  (int)startMoney + " Euros. After 1 year: "  + Math.round(startMoney * 1.005 * 100) / 100.0);
    }
}
