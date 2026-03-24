package homework3;

import java.util.Arrays;
import java.util.Scanner;

/*Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет.*/

public class Homework3_4 {
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

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Количество нулей: " + count);
        } else {
            System.out.println("Нулевых элементов нет");
        }
    }
}
