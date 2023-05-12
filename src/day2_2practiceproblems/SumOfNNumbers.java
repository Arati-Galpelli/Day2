package day2_2practiceproblems;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want to sum :");
        int num = sc.nextInt();
        int res = sumOfNaturalNum(num);
        System.out.println("Sum of"+" "+num+" "+"natural number is :"+res);
    }
    public static int sumOfNaturalNum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
}
