package Localization;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class LocalExample {
    public static void main(String[] args) {
        long number = 5000000;
        NumberFormat numberFormat = NumberFormat.getInstance();

        //System.out.println(number + " is a type " + ((Object)number).getClass().getSimpleName());

        //System.out.println(numberFormat.format(number));
        NumberFormat numberFormatLocal = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(numberFormatLocal.format(number));


        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(dateFormat.format(new Date()));

        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(numberFormat1.getCurrency() + "" + numberFormat1.getCurrency().getDisplayName());


    }
}
