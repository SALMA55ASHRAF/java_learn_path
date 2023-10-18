import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;
import java.lang.Math;
import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your princple : ");
        int p=scanner.nextInt();
        System.out.print("enter annaual interest rate : ");
        float r=scanner.nextFloat();
        r=r/100;
        System.out.print("period :");
        int year=scanner.nextInt();
        double mertage = (p*(r/12))/(1-Math.pow(1+(r/12),-12*year));
        System.out.print("your mertage is : "+NumberFormat.getCurrencyInstance().format(mertage));




    }
}