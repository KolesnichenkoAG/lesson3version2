package lesson3home;
import java.util.Scanner;

public class Lesson3Home {
    public static void main(String[] args) {
        System.out.println("Lesson 3 version 1");
        tackOne();
        tackTwo();
        increase();
        squareDiagonal();
        tackFive();
    }
    public static void tackOne (){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("arr.length: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void tackTwo(){
        int[] arr2 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr2[i] = i;
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
    }
    public static void increase() {
        int[] srarr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < srarr.length; i++) {
            if (srarr[i] < 6) {
                srarr[i] = srarr[i] * 2;
            }
            System.out.print(srarr[i] + " ");
        } System.out.println("");
    }
    public static void squareDiagonal(){
        int[][] table = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == j) {
                    table[i][j] = 1;
                    System.out.print("1 ");
                } else if (i + j == 7) {
                    table[i][j] = 1;
                    System.out.print("1 ");
                } else {
                    System.out.print(table[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void tackFive (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int len = sc.nextInt();
        System.out.println("Введите второе число: ");
        int initialValue = sc.nextInt();
        int[] arr3 = new int[len];
        for (int i = 0; i < len; i++) {
            arr3[i] = initialValue;
            System.out.println("arr3[" + i + "] = " + arr3[i]);
        }
    }
}
