package org.example.exercises;


public class Exercises {
    public void convertIntToBinary(int n){
        String result = "";
        while(n > 0){
            result = result + n % 2;
            n /= 2;
        }
        System.out.println(new StringBuffer(result).reverse());
    }
}
