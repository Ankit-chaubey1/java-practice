    import java.util.*;
import java.text.*;
public class CurrencyFormat {




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        // US
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);

        // India
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);

        // China
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);

        // France
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + usFormat.format(payment));
        System.out.println("India: " + indiaFormat.format(payment));
        System.out.println("China: " + chinaFormat.format(payment));
        System.out.println("France: " + franceFormat.format(payment));
    }
}

