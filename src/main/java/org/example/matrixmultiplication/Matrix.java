package org.example.matrixmultiplication;

import java.util.Scanner;

public class Matrix {
    public void multiplication(){
        int[][] matrix1 = new Matrix().initialize("first matrix");
        int[][] matrix2 = new Matrix().initialize("second matrix");
        int[][] result = new int[matrix1.length][matrix2[0].length];

        while (matrix1[0].length != matrix2.length){
            matrix2 = new Matrix().initialize("second matrix");
        }
        new Matrix().insertionValues("first matrix", matrix1);
        new Matrix().insertionValues("second matrix", matrix2);

        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix2[0].length; j++){
                for (int k = 0; k < matrix2.length; k++){
                    result[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        new Matrix().displayResult(result);
    }

    private void displayResult(int[][] m1){
        for (int i = 0; i < m1.length; i++){
            for (int j = 0; j < m1[0].length; j++){
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }
    }

    private int[][] initialize(String str){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of rows for " + str + ": ");
        int row = scanner.nextInt();

        System.out.print("Input the number of columns for " + str + ": ");
        int col = scanner.nextInt();

        return new int[row][col];
    }

    private void insertionValues(String str, int[][] m1){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < m1.length; i++){
            for (int j = 0; j < m1[0].length; j++){
                System.out.print("Input the numbers of " + (i + 1) + "x" + (j + 1) + " of " + str + " matrix: ");
                m1[i][j] = scanner.nextInt();
            }
        }
    }
}
