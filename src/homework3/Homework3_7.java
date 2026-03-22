package homework3;

import java.util.Arrays;
import java.util.Scanner;

/*Имеется массив из неотрицательных чисел(любой). Представьте что массив
представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} - > 999). Задача
добавить единицу к этому “числу” и на выходе получить исправленный массив.
Массив не содержит нуля в начале, кроме самого числа 0.
Пример:
Input: [1,4,0,5,6,3]
Output: [1,4,0,5,6,4]
Input: [9,9,9]
Output: [1,0,0,0]*/

public class Homework3_7 {
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
                array[i] = (int) (Math.random() * 10);
            }
        }

        System.out.println(Arrays.toString(array));

        // идём с конца, если 9, то следующая цифра +1
        for (int i = array.length - 1; i >= 0; i--) {

            if (array[i] < 9) {
                array[i]++;
                break;
            }

            array[i] = 0; // раз мы здесь, значит break не сработал, так что это всё равно else

            // если дошли до начала и всё были 9
            if (i == 0) {
                int[] newArray = new int[array.length + 1];
                newArray[0] = 1;
                array = newArray; //это я честно подсмотрела у чатагпт, что так можно, и ничего не сломается из-за размерности
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
