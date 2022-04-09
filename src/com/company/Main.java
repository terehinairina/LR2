package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("vvedite n ");
        int n = scanner.nextInt();
        System.out.print("vvedite x ");
        int x = scanner.nextInt();
        double result=0;
        for (int j = 1; j <= n; j++) {
            int h = (2*n+1);
            int factorial = h;
            for (int i = 1; i <= j; i++) {
                factorial *= i;
            }
            double summa = (Math.pow((-1), n) * Math.pow(x, 2*n) / factorial);
            result = result + summa;

        }

        System.out.println(result);

    }

}


