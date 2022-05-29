package hometask.task5;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Задайте высоту прямоугольника h = ");
        int h = input.nextInt();

        System.out.print("Задайте длину прямоугольника l = ");
        int l = input.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
