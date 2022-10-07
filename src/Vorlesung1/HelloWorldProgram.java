package Vorlesung1;

import java.util.Scanner;

public class HelloWorldProgram {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("My name is Lars");
        System.out.println(4+4);
        System.out.println(4*4);
        System.out.println(7 / 2);
        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * b);
        int alter = 35;
        boolean fahrerlaubnis = false;
        boolean volljaehrig = false;
        if (alter >= 18)
            volljaehrig = true;
    }

    private static void example(){
        // Can not access variables from the Main Function
        // fahrerlaubnis would be unknown in the example method
    }
}
