package hometask.task2;

import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите число А = ");
        int a = input.nextInt();

        System.out.print("Введите число В = ");
        int b = input.nextInt();
        int summ = 0;

        if (a >= b) {
            System.out.println("Число A должно быть меньше числа B. Повторите ввод.");
            return;
        }

        //1. выведем суму всех чисел, расположенных между данными числами
        for (int i = a; i < b; i++) {
            summ += i;
        }
        System.out.println("Сумма чисел в интервале [" + a + " - " + b + "] = " + summ);

        //2. выведем все нечетные значения, расположенные между данными числами
        System.out.print("Нечетные значения в интервале [" + a + " - " + b + "]: ");

        for (int i = a; i < b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
