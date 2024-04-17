package org.example.patterns;

public class PatternsIsoscelesTriangle {
    int n = 5;

    public void displayIsoscelesTriangle(){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for (int k = n; k > i-1; k--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
