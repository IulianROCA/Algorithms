package org.example.polindrom;

import java.util.Scanner;

public class Polindrom {
    Scanner scanner = new Scanner(System.in);

    public void polindrom(){
        System.out.print("Input your text to be checked: ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != str.charAt(str.length()-i-1)){
                System.out.println("Your text: " + str + " is not a polindrom!");
                break;
            }
        }
        System.out.println("Your text: " + str + " is a polindrom!");
    }
}
