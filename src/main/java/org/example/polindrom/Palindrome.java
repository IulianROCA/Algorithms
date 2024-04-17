package org.example.polindrom;

import java.util.Scanner;

public class Palindrome {
    Scanner scanner = new Scanner(System.in);

    public void palindrome(){
        System.out.print("Input your text to be checked: ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != str.charAt(str.length()-i-1)){
                System.out.println("Your text: " + str + " is not a palindrome!");
                break;
            }
        }
        System.out.println("Your text: " + str + " is a palindrome!");
    }
}
