package org.example.patterns;


import java.util.Scanner;

public class Patterns {
    Scanner scanner = new Scanner(System.in);
    public void displayPattern(){
        int n = new Patterns().getTheNumber();
        int edge = new Patterns().selectEdge();
        int isNumberOnEdge = new Patterns().isNumberOnEdge();
        int isNormalUpDown = new Patterns().isTriangleReversedUpDown();
        int isNormalLeftRight = new Patterns().isTriangleReversedLeftRight();

        int resultType = edge*1000+isNumberOnEdge*100+isNormalUpDown*10+isNormalLeftRight;

        switch (resultType) {
            case 1011: new Patterns().bigLegEdgeNumberNotOnEdgeNormalUpDownNormalLeftRight(n);break;
            case 1010: new Patterns().bigLegEdgeNumberNotOnEdgeNormalUpDownReverseLeftRight(n);break;
            case 1001: new Patterns().bigLegEdgeNumberNotOnEdgeReverseUpDownNormalLeftRight(n);break;
            case 1000: new Patterns().bigLegEdgeNumberNotOnEdgeReverseUpDownReverseLeftRight(n);break;
            case 1111: new Patterns().bigLegEdgeNumberIsOnEdgeNormalUpDownNormalLeftRight(n);break;
            case 1110: new Patterns().bigLegEdgeNumberIstOnEdgeNormalUpDownReverseLeftRight(n);break;
            case 1101: new Patterns().bigLegEdgeNumberIstOnEdgeReverseUpDownNormalLeftRight(n);break;
            case 1100: new Patterns().bigLegEdgeNumberIstOnEdgeReverseUpDownReverseLeftRight(n);break;
            case 2011: new Patterns().smallLegEdgeNumberNotOnEdgeNormalUpDownNormalLeftRight(n);break;
            case 2010: new Patterns().smallLegEdgeNumberNotOnEdgeNormalUpDownReverseLeftRight(n);break;
            case 2001: new Patterns().smallLegEdgeNumberNotOnEdgeReverseUpDownNormalLeftRight(n);break;
            case 2000: new Patterns().smallLegEdgeNumberNotOnEdgeReverseUpDownReverseLeftRight(n);break;
            case 2111: new Patterns().smallLegEdgeNumberIsOnEdgeNormalUpDownNormalLeftRight(n);break;
            case 2110: new Patterns().smallLegEdgeNumberIsOnEdgeNormalUpDownReverseLeftRight(n);break;
            case 2101: new Patterns().smallLegEdgeNumberIsOnEdgeReverseUpDownNormalLeftRight(n);break;
            case 2100: new Patterns().smallLegEdgeNumberIsOnEdgeReverseUpDownReverseLeftRight(n);break;
            case 3011: new Patterns().hypotenuseEdgeNumberNotOnEdgeNormalUpDownNormalLeftRight(n);break;
            case 3010: new Patterns().hypotenuseEdgeNumberNotOnEdgeNormalUpDownReverseLeftRight(n);break;
            case 3001: new Patterns().hypotenuseEdgeNumberNotOnEdgeReverseUpDownNormalLeftRight(n);break;
            case 3000: new Patterns().hypotenuseEdgeNumberNotOnEdgeReverseUpDownReverseLeftRight(n);break;
            case 3111: new Patterns().hypotenuseEdgeNumberIsOnEdgeNormalUpDownNormalLeftRight(n);break;
            case 3110: new Patterns().hypotenuseEdgeNumberIsOnEdgeNormalUpDownReverseLeftRight(n);break;
            case 3101: new Patterns().hypotenuseEdgeNumberIsOnEdgeReverseUpDownNormalLeftRight(n);break;
            case 3100: new Patterns().hypotenuseEdgeNumberIsOnEdgeReverseUpDownReverseLeftRight(n);break;
        }
    }

    private void bigLegEdgeNumberNotOnEdgeNormalUpDownNormalLeftRight(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (j <= i){
                    System.out.print(j + " ");
                }
                //else{
                //    System.out.println(" " + " ");
                //}
            }
            System.out.println(" ");
        }
    }

    private void bigLegEdgeNumberNotOnEdgeNormalUpDownReverseLeftRight(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = n; j > 0; j--){
                if (j <= i){
                    System.out.print(j + " ");
                }
                else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println(" ");
        }
    }

    private void bigLegEdgeNumberNotOnEdgeReverseUpDownNormalLeftRight(int n) {
        for (int i = n; i > 0; i--){
            for (int j = 1; j <= n; j++){
                if (j <= i){
                    System.out.print(j + " ");
                }
                //else{
                //    System.out.println(" " + " ");
                //}
            }
            System.out.println();
        }
    }

    private void bigLegEdgeNumberNotOnEdgeReverseUpDownReverseLeftRight(int n) {
        for (int i = n; i > 0; i--){
            for (int j = n; j > 0; j--){
                if (j <= i){
                    System.out.print(j + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    private void bigLegEdgeNumberIsOnEdgeNormalUpDownNormalLeftRight(int n) {
        for (int i = n; i > 0; i--){
            for (int j = n; j > 0; j--){
                if (i <= j){
                    System.out.print(j + " ");
                }
                //else{
                //    System.out.print(" " + " ");
                //}
            }
            System.out.println();
        }
    }

    private void bigLegEdgeNumberIstOnEdgeNormalUpDownReverseLeftRight(int n) {
        for (int i = n; i > 0; i--){
            for (int j = 1; j <= n; j++){
                if (j >= i){
                    System.out.print(j + " ");
                }
                else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println(" ");
        }
    }

    private void bigLegEdgeNumberIstOnEdgeReverseUpDownNormalLeftRight(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = n; j > 0; j--){
                if (j >= i){
                    System.out.print(j + " ");
                }
                //else{
                //    System.out.print(" " + " ");
                //}
            }
            System.out.println();
        }
    }

    private void bigLegEdgeNumberIstOnEdgeReverseUpDownReverseLeftRight(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (j >= i){
                    System.out.print(j + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    private void smallLegEdgeNumberNotOnEdgeNormalUpDownNormalLeftRight(int n) {
        for (int i = n; i > 0; i--){
            for (int j = n; j > 0; j--){
                if (j >= i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    private void smallLegEdgeNumberNotOnEdgeNormalUpDownReverseLeftRight(int n) {
        for (int i = n; i > 0; i--){
            for (int j = 1; j <= n; j++){
                if (j >= i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    private void smallLegEdgeNumberNotOnEdgeReverseUpDownNormalLeftRight(int n) {
        for (int i =1; i <= n; i++){
            for (int j = n; j > 0; j--){
                if (j >= i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    private void smallLegEdgeNumberNotOnEdgeReverseUpDownReverseLeftRight(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (j >= i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    private void smallLegEdgeNumberIsOnEdgeNormalUpDownNormalLeftRight(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i >= j){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    private void smallLegEdgeNumberIsOnEdgeNormalUpDownReverseLeftRight(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = n; j > 0; j--) {
                if (j <= i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    private void smallLegEdgeNumberIsOnEdgeReverseUpDownNormalLeftRight(int n) {
        for (int i = n; i > 0; i--){
            for (int j = 1; j <= n; j++){
                if (j <= i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    private void smallLegEdgeNumberIsOnEdgeReverseUpDownReverseLeftRight(int n) {
        for (int i = n; i > 0; i--){
            for (int j = n; j > 0; j--){
                if (j <= i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    private void hypotenuseEdgeNumberNotOnEdgeNormalUpDownNormalLeftRight(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = n; j > 0; j--){
                if (i + j > n){
                    System.out.print((i + j - n) + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    private void hypotenuseEdgeNumberNotOnEdgeNormalUpDownReverseLeftRight(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i + j > n){
                    System.out.print((i + j - n) + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    private void hypotenuseEdgeNumberNotOnEdgeReverseUpDownNormalLeftRight(int n) {
        for (int i = n; i > 0; i--){
            for (int j = n; j > 0; j--){
                if (i + j > n){
                    System.out.print((i + j - n) + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    private void hypotenuseEdgeNumberNotOnEdgeReverseUpDownReverseLeftRight(int n) {
        for (int i = n; i > 0; i--){
            for (int j = 1; j <= n; j++){
                if (i + j > n){
                    System.out.print((i + j - n) + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    private void hypotenuseEdgeNumberIsOnEdgeNormalUpDownNormalLeftRight(int n) {
        for (int i = n; i > 0; i--){
            for (int j = 1; j <= n; j++){
                if (i + j <= n + 1){
                    System.out.print((i + j - 1) + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    private void hypotenuseEdgeNumberIsOnEdgeNormalUpDownReverseLeftRight(int n) {
        for (int i = n; i > 0; i--){
            for (int j = n; j > 0; j--){
                if (i + j <= n + 1){
                    System.out.print((i + j - 1) + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    private void hypotenuseEdgeNumberIsOnEdgeReverseUpDownNormalLeftRight(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i + j <= n + 1){
                    System.out.print((i + j - 1) + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    private void hypotenuseEdgeNumberIsOnEdgeReverseUpDownReverseLeftRight(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = n; j > 0; j--){
                if (i + j <= n + 1){
                    System.out.print((i + j - 1) + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }


    private int isTriangleReversedLeftRight(){
        System.out.println("Triangle position?");
        System.out.println("0 - Reversed Left/Right");
        System.out.println("1 - Normal");
        return scanner.nextInt();
    }
    private int isTriangleReversedUpDown(){
        System.out.println("Triangle position?");
        System.out.println("0 - Reversed Up/Down");
        System.out.println("1 - Normal");
        return scanner.nextInt();
    }
    private int isNumberOnEdge(){
        System.out.println("Do you want your number on your edge?");
        System.out.println("0 - No");
        System.out.println("1 - Yes");
        return scanner.nextInt();
    }
    private int selectEdge(){
        System.out.println("Chose one edge: ");
        System.out.println("1 - Big Leg");
        System.out.println("2 - Small Leg");
        System.out.println("3 - Hypotenuse");
        return scanner.nextInt();
    }
    private int getTheNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number: ");
        return scanner.nextInt();
    }
}
