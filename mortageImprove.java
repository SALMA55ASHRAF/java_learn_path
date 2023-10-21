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
        System.out.print("enter your princple  ($1K - $1M) : ");
        int p=scanner.nextInt();
        if(p<1000 || p>1_000_000){
            System.out.println("enter num between 1,000 and 1000000.");
            System.out.print("enter your princple  ($1K - $1M) : ");
            p=scanner.nextInt();
        }
        System.out.print("enter annaual interest rate : ");
        float r=scanner.nextFloat();
        if(r<=0 || r>30){
                System.out.println("enter rate greater than 0 or less than or equal 30.");
                System.out.print("enter annaual interest rate : ");
                r=scanner.nextFloat();
            }
        r=r/100;
        System.out.print("period :");
        int year=scanner.nextInt();
        if(year<1 || year<30){
                    System.out.println("enter years between 1 and 30.");
                    System.out.print("period :");
                    year=scanner.nextInt();
                }
        double mertage = (p*(r/12))/(1-Math.pow(1+(r/12),-12*year));
        System.out.print("your mertage is : "+NumberFormat.getCurrencyInstance().format(mertage));

            }
    }