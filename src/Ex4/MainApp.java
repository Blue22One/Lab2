package Ex4;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n=");
        int n = scanner.nextInt();
        String cnp, nume;
        int i = 0;
        int ok = 0;
        List<Persoana> persoane = new ArrayList<>();
        while (i < n) {
            i++;
            nume = scanner.next();
            while (ok == 0) {
                cnp = scanner.next();
                if (cnp.length() == 13 && Digits(cnp) == 1 && ControlCorect(cnp) == 1) {
                    ok = 1;
                }
                if (ok == 0)
                    System.out.println("Eroare! Reintroduceti CNP-ul:");
                else {
                    Persoana pers = new Persoana(nume, cnp);
                    persoane.add(pers);
                }
            }
        }
        for(Persoana pers : persoane)
            System.out.println(pers.getNume() + " " + pers.getCnp() + " " + pers.getVarsta());
        scanner.close();
    }

    public static int Digits(String sir) {
        if (sir.charAt(0) != '1' && sir.charAt(0) != '2' && sir.charAt(0) != '5' && sir.charAt(0) != '6')
            return 0; // verificam sa avem prima cifra 1,2,5,6
        for (int i = 1; i < sir.length(); i++) {
            if (sir.charAt(i) < '0' || sir.charAt(i) > '9') { // verificam sa avem caractere numerice
                return 0;
            }
        }
        return 1;
    }

    public static int ControlCorect(String sir) {
        String value = "279146358279";
        int suma = 0;
        int x, y;
        for (int i = 0; i < 12; i++) {
            x = Integer.parseInt(String.valueOf(sir.charAt(i)));
            y = Integer.parseInt(String.valueOf(value.charAt(i)));
            suma += x * y;
        }
        if ((suma % 11) == Integer.parseInt(String.valueOf(sir.charAt(12))))
            return 1;
        return 0;
    }
}
