package hometask.task2;

import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("������� ����� � = ");
        int a = input.nextInt();

        System.out.print("������� ����� � = ");
        int b = input.nextInt();
        int summ = 0;

        if (a >= b) {
            System.out.println("����� A ������ ���� ������ ����� B. ��������� ����.");
            return;
        }

        //1. ������� ���� ���� �����, ������������� ����� ������� �������
        for (int i = a; i < b; i++) {
            summ += i;
        }
        System.out.println("����� ����� � ��������� [" + a + " - " + b + "] = " + summ);

        //2. ������� ��� �������� ��������, ������������� ����� ������� �������
        System.out.print("�������� �������� � ��������� [" + a + " - " + b + "]: ");

        for (int i = a; i < b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
