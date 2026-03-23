package homework3;

import java.util.Arrays;

import java.util.Scanner;

/* Найти минимальный - максимальный элементы и вывести в консоль. */

public class Homework3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();

        System.out.println("Введите true (массив будет заполнен с клавиатуры) или false (рандом):");

        boolean manual = scanner.nextBoolean();

        int[] array = new int[size];

        if (manual) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Введите элемент " + i + ":");
                array[i] = scanner.nextInt();
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100);
            }
        }

        System.out.println(Arrays.toString(array));

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
    }
}
