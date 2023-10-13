package Ex4;

import java.text.ParseException;
import java.time.LocalDate;

public class Persoana {
    private String nume;
    private String cnp;

    Persoana(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public String getCnp() {
        return cnp;
    }

    public int getVarsta() throws ParseException {
        LocalDate ld = LocalDate.now();//2023-10-06
        String an;
        if (cnp.charAt(0) < 3)
            an = "19" + cnp.substring(1, 3);
        else
            an = "20" + cnp.substring(1, 3);

        String luna = cnp.substring(3, 5);
        String zi = cnp.substring(5, 7);
        String data = an + "-" + luna + "-" + zi;
        LocalDate dataN = LocalDate.parse(data);

        int v = ld.getYear() - dataN.getYear();
        if (ld.getMonthValue() < dataN.getMonthValue()) {
            v--;
        } else if (ld.getMonthValue() == dataN.getMonthValue()) {
            if (ld.getDayOfMonth() < dataN.getDayOfMonth())
                v--;
        }
        return v;
    }
}
