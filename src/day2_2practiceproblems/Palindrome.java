package day2_2practiceproblems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check palindrome :");
        int num = sc.nextInt();
        reverse(num);
    }

    public static void reverse(int num) {
        int rev = 0,temp = num;
        for(;num!=0;num=num/10)
            rev = rev * 10 + num % 10;
        System.out.println("Reverse Number is:"+rev);
        if(rev==temp)
            System.out.println("Given number is palindrome");
        else
            System.out.println("Given number is not palindrome");
    }
}
