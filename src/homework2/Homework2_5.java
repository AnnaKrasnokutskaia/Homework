package homework2;

import java.util.Scanner;

/* Напишите программу, где пользователь вводит любое целое положительное
число.
А программа суммирует все числа от 1 до введенного пользователем числа. Для
ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
пользователь не мог ввести некорректные данные */

public class Homework2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                long sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                System.out.println("Сумма чисел от 1 до " + n + " равна "+ sum);
            } else {
                System.out.println("Просили же положительное :( ");
            }
        } else {
            System.out.println("Просили же целое число!");
        }
    }
}
