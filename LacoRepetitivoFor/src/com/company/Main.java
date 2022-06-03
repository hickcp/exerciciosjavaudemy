package com.company;

import java.util.Scanner;

// Trabalhando com laço repetitivo FOR
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0;
        int z = 0;
        for (int i = 0; i < x; i++) {
           y = sc.nextInt();
           z += y;
        }
        System.out.println(z);
    }

}
