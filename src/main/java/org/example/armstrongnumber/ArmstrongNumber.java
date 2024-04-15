package org.example.armstrongnumber;

import java.util.Scanner;

public class ArmstrongNumber {
    public void isArmstrongNumber(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number: ");
        int number = scanner.nextInt();
        int n = number;
        int n1= number;
        int exp = 0;
        double result = 0;

        while (n > 0){
            exp ++;
            n = n / 10;
        }

        while (n1 > 0){
            int base = n1 % 10;
            result += Math.pow(base,exp);

            n1 = n1 / 10;
        }
        if (number == result) {
            System.out.println(number + " este numar Armstrong.");
        }
        else {
            System.out.println(number + " nu este numar Armstrong.");
        }
    }
}
