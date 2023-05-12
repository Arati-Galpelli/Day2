package day2_3practiceproblems;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to check :");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                System.out.println("Entered Character is Vowel");
                break;
            default:
                System.out.println("Entered Character is Consonant");
        }
    }
}



