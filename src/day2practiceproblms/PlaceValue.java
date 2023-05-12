package day2practiceproblms;

import java.util.Scanner;
public class PlaceValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        toPlaceValue(num);
    }
    public static void toPlaceValue(int num){
        if(num==1)
            System.out.println("Unit");
        else if(num==10)
            System.out.println("Ten");
        else if(num==100)
            System.out.println("Hundred");
        else if(num==1000)
            System.out.println("Thousand");
        else if(num==10000)
            System.out.println("Ten Thousand");
        else
            System.out.println("Invalid number");

    }
}
