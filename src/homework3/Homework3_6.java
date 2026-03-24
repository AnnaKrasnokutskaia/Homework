package homework3;

import java.util.Arrays;
import java.util.Scanner;

/* Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего).*/

public class Homework3_6 {
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

        boolean isIncreasing = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Массив возрастающий");
        } else {
            System.out.println("Массив не является возрастающим");
        }
    }
}
