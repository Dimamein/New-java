package com.company;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;

        do {
            System.out.println("Choose:");
            System.out.println("1. Obliczenie pola prostokąta");
            System.out.println("2. Obliczenie pola kwadrat");
            System.out.println("3. Obliczenie pola trójkąta");
            System.out.println("0. Zakończ1 program");
            System.out.println();
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Podaj bok prostokąta:");
                    int a = scanner.nextInt();
                    System.out.println("Podaj drugi bok prostokąta:");
                    int b = scanner.nextInt();
                    System.out.println("Pole prostokąta wynosi:" + a*b);
                    break;
                case 2:
                    System.out.println("Podaj bok kwadrata:");
                    int c = scanner.nextInt();;
                    System.out.println("Pole kwadrat wynosi:" + (c*c));
                    break;
                case 3:
                    System.out.println("Podaj bok trójkąta:");
                    int n = scanner.nextInt();
                    System.out.println("Podaj wysokość trójkąta:");
                    int h = scanner.nextInt();
                    System.out.println("Pole trójkąta wynosi:" + (n * h /2.0));
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (i != 0); {

        }


    }
}
