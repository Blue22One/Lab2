package Ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Citire de la fisier sau tastatura?");
        Scanner scanner = new Scanner(System.in);
        int opt = scanner.nextInt();

        if (opt == 0) {
            System.out.println("de completat");
        } else if (opt == 1) {
            System.out.println("Introduceti sirul initial:");
            String sir = scanner.next();
            String sirAux = sir;

            System.out.println("Introduceti pozitia:");
            int poz = scanner.nextInt();
            System.out.println("introd sirul de inserat");
            String sir2 = scanner.next();

            sir = sir.substring(0, poz) + sir2 + sir.substring(poz);
            System.out.println(sir);

            System.out.println("Pozitia de start pt sters:");
            poz = scanner.nextInt();
            System.out.println("Lungimea de caractere a secventei sterse:");
            int len = scanner.nextInt();
            StringBuilder sb = new StringBuilder(sirAux);
            sb.delete(poz - 1, poz + len - 1);
            System.out.println(sb);
        }
        scanner.close();
    }
}
