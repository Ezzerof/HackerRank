package Introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double payment = inp.nextDouble();
        inp.close();
        Locale USLocale = new Locale("en", "US");
        Locale INLocale = new Locale("en", "IN");
        Locale CNLocale = new Locale("zh", "CN");
        Locale FRLocale = new Locale("fr", "FR");

        if (payment > 0 && payment < Math.pow(10,9)){
            NumberFormat currencyFormatterUS = NumberFormat.getCurrencyInstance(USLocale);
            System.out.println("US: " + currencyFormatterUS.format(payment));
            NumberFormat currencyFormatterIN = NumberFormat.getCurrencyInstance(INLocale);
            System.out.println("India: " + currencyFormatterIN.format(payment));
            NumberFormat currencyFormatterCH = NumberFormat.getCurrencyInstance(CNLocale);
            System.out.println("China: " + currencyFormatterCH.format(payment));
            NumberFormat currencyFormatterFR = NumberFormat.getCurrencyInstance(FRLocale);
            System.out.println("France: " + currencyFormatterFR.format(payment));
        }else
            System.out.println("Wrong amount.");

    }
}
