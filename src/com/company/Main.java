package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;

        do {
            System.out.println("Wprowadź numer miesiąca");
            i = scanner.nextInt();
            switch (i) {
                case 2:
                    System.out.println("Luty dni: 28");
                    break;
                case 3:
                    System.out.println("Marzec dni: 31");
                    break;
                case 4:
                    System.out.println("Kwiecień dni: 30");
                    break;
                case 5:
                    System.out.println("Maj dni: 31");
                    break;
                case 6:
                    System.out.println("Czerwiec dni: 30");
                    break;
                case 7:
                    System.out.println("Lipiec dni: 31");
                    break;
                case 8:
                    System.out.println("Sierpień dni: 31");
                    break;
                case 9:
                    System.out.println("Wrzesień dni: 30");
                    break;
                case 10:
                    System.out.println("Październik dni: 31");
                    break;
                case 11:
                    System.out.println("Listopad dni: 30");
                    break;
                case 12:
                    System.out.println("Grudzień dni: 31");
                    break;
                case 1:
                    System.out.println("Styczeń dni: 31");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Brak numeru");
                    break;
            }
        } while (i != 0);
        {

        }
    }
}

//        first
//        int i;
//
//        do {
//            System.out.println("Choose:");
//            System.out.println("1. Obliczenie pola prostokąta");
//            System.out.println("2. Obliczenie pola kwadrat");
//            System.out.println("3. Obliczenie pola trójkąta");
//            System.out.println("0. Zakończ1 program");
//            System.out.println();
//            i = scanner.nextInt();
//            switch (i) {
//                case 1:
//                    System.out.println("Podaj bok prostokąta:");
//                    int a = scanner.nextInt();
//                    System.out.println("Podaj drugi bok prostokąta:");
//                    int b = scanner.nextInt();
//                    System.out.println("Pole prostokąta wynosi:" + a*b);
//                    break;
//                case 2:
//                    System.out.println("Podaj bok kwadrata:");
//                    int c = scanner.nextInt();;
//                    System.out.println("Pole kwadrat wynosi:" + (c*c));
//                    break;
//                case 3:
//                    System.out.println("Podaj bok trójkąta:");
//                    int n = scanner.nextInt();
//                    System.out.println("Podaj wysokość trójkąta:");
//                    int h = scanner.nextInt();
//                    System.out.println("Pole trójkąta wynosi:" + (n * h /2.0));
//                    break;
//                case 0:
//                    System.exit(0);
//                    break;
//            }
//        } while (i != 0); {
//
//        }


//    }
//}

//end first