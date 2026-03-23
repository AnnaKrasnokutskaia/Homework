package homework3;

import java.util.Scanner;

/*Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:*/

/* Пройти по массиву, вывести все элементы в прямом и в обратном порядке. */

public class Homework3_1 {
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

        // прямой порядок
        System.out.println("Прямой порядок:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // обратный порядок
        System.out.println("Обратный порядок:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }

}

