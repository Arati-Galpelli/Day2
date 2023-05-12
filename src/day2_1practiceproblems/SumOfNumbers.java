package day2_1practiceproblems;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want to sum :");
        int num = sc.nextInt();
        int res = sumOfNaturalNum(num);
        System.out.println("Sum of"+" "+num+" "+"natural number is :"+res);
    }
    public static int sumOfNaturalNum(int n){
        int i=0,sum=0;
        while(i<=n){
            sum = sum+i;
            i++;
        }
        return sum;
    }
}
