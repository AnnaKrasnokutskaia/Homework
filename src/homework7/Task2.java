package homework7;

import java.util.Scanner;

/* Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
возрастания значений их длины. */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            System.out.printf("Введите строку номер %d%n", i+1);
            strings[i] = scanner.nextLine();
        }
        //сортируем пузырьком, для 3шт приемлемо
        String temp;
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - 1 - i; j++) {
                if (strings[j].length() > strings[j + 1].length()) {
                    temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }
    }
}
