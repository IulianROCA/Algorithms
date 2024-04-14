package org.example.factorialnumber;

import java.util.Scanner;

public class FactorialNumber {
    Scanner scanner = new Scanner(System.in);
    long result =1;
    public void factorialNumber(){
        System.out.print("Input the \"n\" number to calculate his factorial: ");
        int n=scanner.nextInt();

        int i = 1;
        while (i < n){
            result += result * i;
            i++;
        }
        System.out.println("Result of \"" + n + "\"! is: " + result);
    }
}
