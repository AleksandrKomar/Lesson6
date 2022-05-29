package hometask.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        rectangle(input);
        rightTriangle(input);
        equilateralTriangle(input);
        rhombus(input);
    }

    static void rectangle(Scanner input) {

        System.out.print("������� ������ �������������� h = ");
        int h = input.nextInt();

        System.out.print("������� ����� �������������� l = ");
        int l = input.nextInt();

        System.out.println("------�������������------------");

        //////////////////����� ��������������///////////////
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
    static void rightTriangle(Scanner input) {

        System.out.print("������� ������ �������������� ������������ h = ");
        int h1 = input.nextInt();

        System.out.println("------������������� �����������------------");

        //////////////////����� �������������� ������������//////////////
        for (int i = 0; i < h1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void equilateralTriangle(Scanner input) {
        System.out.print("������� ������ ��������������� ������������ h = ");
        int l1 = input.nextInt();

        System.out.println("------�������������� �����������------------");

        for (int i = 1; i <= l1; i++) {
            for (int j = l1; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void rhombus(Scanner input) {

        System.out.print("������� ����� ����� l = ");
        int l2 = input.nextInt();

        System.out.println("------����------------");

        if (l2 % 2 == 0) {
            l2++;
        }

        int temp = 1;

        for (int i = 0; i < l2 / 2 + 1; i++) {

            int probel = (l2 - temp) / 2;

            for (int j = 0; j < probel; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < temp; k++) {
                System.out.print("*");
            }
            System.out.println();
            temp = temp + 2;
        }

        temp = l2 - 2;

        for (int i = l2 / 2; i > 0; i--) {

            int probel = (l2 - temp) / 2;

            for (int j = 0; j < probel; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < temp; k++) {
                System.out.print("*");
            }
            System.out.println();
            temp = temp - 2;
        }
        System.out.println();
    }

}
