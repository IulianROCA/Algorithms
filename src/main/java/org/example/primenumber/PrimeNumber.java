package org.example.primenumber;

import java.util.Scanner;

public class PrimeNumber {
    public void isPrimeNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number: ");
        int n = scanner.nextInt();
        boolean isPrimeNumber = true;

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                System.out.println("Your number: \"" + n + "\" is not a prime number.");
                isPrimeNumber = false;
                break;
            }
        }
        if (isPrimeNumber){
            System.out.println("Your number: \"" + n + "\" is a prime number.");
        }
    }
}
