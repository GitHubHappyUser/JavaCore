package ru.geekbrains.exam1;

import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        System.out.println("First\n" + new int[][] {{1, 2, 7},{3, 4, 30}}[1][2] + "\n");
        second();
        third();
        fourth();
        fifth();
        sixth();
        seventh();
    }

    private static void second() {
        System.out.print("Second\n");
        for (int j = 0; j < 10; j++) {
            System.out.print(j + " ");
        } System.out.println("\n");
    }

    public static void third() {
        System.out.print("Third\n");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            } System.out.println();
        }
        System.out.println("\n");
    }

    public static void fourth() {
        System.out.print("Fourth\n");
        {
            int counter = 1;
            int[][] table = new int[3][4];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    table[i][j] = counter;
                    System.out.print(table[i][j] + " ");
                    counter++;
                }
                System.out.println();
            }
        }
        System.out.println("\n");
    }

    public static void fifth() {
        System.out.println("Fifth");
        int[] arr = {2, 4, 5, 1, 2, 3, 4, 5};
        System.out.println("arr.length: " + arr.length);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
    }

    public static void sixth() {
        System.out.println("Sixth");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        a *= 2;
        System.out.println("Введенное вами число, умноженное на 2, равно " + a);
        sc.close();
        System.out.println("\n");
    }

    public static void seventh() {
        System.out.println("Seventh");
        String s1 = "Java1";
        String s2 = new String("Java1");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

}
