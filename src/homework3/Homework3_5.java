package homework3;

import java.util.Arrays;
import java.util.Scanner;

/*Пройти по массиву и поменять местами элементы первый и последний, второй
и предпоследний и т.д.*/

public class Homework3_5 {
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

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
