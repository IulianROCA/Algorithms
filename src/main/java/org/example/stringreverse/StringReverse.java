package org.example.stringreverse;

import java.util.Scanner;

public class StringReverse {
    Scanner scanner = new Scanner(System.in);
    String string;
    String newStr;
    public void stringReverse(){
        System.out.print("Input your text: ");
        string =scanner.nextLine();

        for (int i = 0; i< string.length(); i++){
            newStr += string.charAt(string.length()-i-1);
        }

        System.out.println("Your input text: " + string + "and reversed is: " + newStr);
    }
}
