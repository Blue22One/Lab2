package Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        String[] tablou = new String[42];
        String x;
        Scanner scanner = new Scanner(new File("D:\\Facultate\\Anul III\\Semestrul I\\PJ\\Laborator\\Lab2\\src\\Ex1\\judete_in.txt"));

        int i = 0;
        while (scanner.hasNext()) {
            x = scanner.next();
            tablou[i] = x;
            i++;
        }
        Arrays.sort(tablou, 0, i);
        for (int j = 0; j < i; j++) {
            System.out.println(tablou[j]);
        }
        scanner = new Scanner(System.in);
        System.out.println("Introduceti judetul cautat:");
        String judet = scanner.next();
        int poz = Arrays.binarySearch(tablou, judet);
        scanner.close();

        System.out.println();
        System.out.println("Judetul se afla pe pozitia " + poz);

    }
}
