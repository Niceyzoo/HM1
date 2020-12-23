package ru.geekbrains.hm1;

import java.util.Arrays;

public class HomeWork02 {
    public static void main(String[] args) {
        System.out.println("Task1");
        int[] intArray = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(intArray));
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = intArray[i] == 1 ? 0 : 1;
            System.out.print(intArray[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Task2");
        int[] intArray01 = new int[8];
        for (int i = 1, f = 0; i < intArray01.length; i++) intArray01[i] = f += 3;
        for (int x : intArray01) {
            System.out.print(x + " ");
        }

        System.out.println(" ");
        System.out.println("Task3");
        int[] intArray02 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < intArray02.length; i++) {
            if (intArray02[i] < 6) intArray02[i] *= 2;
            System.out.print(intArray02[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Task4");
        int[][] table = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = 1;
                {
                    if (i == j) {
                        table[i][j] = 1;
                    } else {
                        table[i][j] = 0;
                    }
                    System.out.print(table[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

