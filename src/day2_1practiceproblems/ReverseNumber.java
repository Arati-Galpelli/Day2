package day2_1practiceproblems;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to reverse :");
        int num = sc.nextInt();
        reverse(num);
    }

    public static void reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num=num/10;
        }
        System.out.println("Reverse number is :" + rev);
    }

}
