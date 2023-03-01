package exercicios;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AnoBissexto {
    public static void main(String[] args) {
        Calendar cal = GregorianCalendar.getInstance();
        GregorianCalendar cal2 = new GregorianCalendar();

            if (cal2.isLeapYear(cal.get(Calendar.YEAR))){
            System.out.println("Ano " + cal.get(Calendar.YEAR) +
                    " é bissexto.");
        }
        else{
            System.out.println("Ano " + cal.get(Calendar.YEAR) +
                    " não é bissexto.");
        }
    }
}
