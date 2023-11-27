import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int j=1;
        System.out.printf("enter number of students : ");
        int numberofstudents=scan.nextInt();
        //System.out.println(numberofstudents);
        int [] arr=new int[numberofstudents];
        for(int i=0;i<numberofstudents;i++){
            System.out.printf("enter age of each student "+j+": ");
            arr[i]= scan.nextInt();
            j++;
        }
        int k=1;
        for(int i=0;i<numberofstudents;i++){
            if(arr[i]>=15){

                System.out.println("student "+k+"will get vaccine :) ");
            }
            else{
                System.out.println("student "+k+"will not get  vaccine :( ");
            }
            k++;
        }


    }
}