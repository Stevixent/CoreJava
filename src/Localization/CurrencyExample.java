package Localization;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyExample {
    public static void main(String[] args) {

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("de","DE"));

        String currency = numberFormat.format(1000000);
        System.out.println(currency);


    }
}
