package org.example.fibonacci;

import java.util.Scanner;

public class FibonacciSeries {
    Scanner scanner = new Scanner(System.in);
    int n, i;
    int sum1 = 0;
    int sum2 = 0;

    public void fibonacciSeries(){
        System.out.print("Input the n-th of fibonacci series: ");
        n=scanner.nextInt();

        int[] fibonacciArray = new int[n];
        i = 2;
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        while (i < n){
            fibonacciArray[i] = fibonacciArray[i-2] + fibonacciArray[i-1];
            i++;
        }

        for (i = 0; i < fibonacciArray.length; i++){
            System.out.print(fibonacciArray[i] + " ");
        }
    }
}
