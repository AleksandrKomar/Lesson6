package hometask.task4;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("������� ���������� ��������, ��� ������� �������� = ");
        int n = input.nextInt();

        int factoril = 1;

        do {
            factoril *= n--;
        } while (n > 0);

        System.out.println("���������� ��������� ��������� �������� - " + factoril + ".");

    }
}
