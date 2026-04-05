package homework7;

/* Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину. */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            System.out.printf("Введите строку номер %d%n", i+1);
            strings[i] = scanner.nextLine();
        }

        String min = strings[0];
        String max = strings[0];

        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() < min.length()) {
                min = strings[i];
            }
            if (strings[i].length() > max.length()) {
                max = strings[i];
            }
        }

        System.out.printf("Самая короткая: %s (%d)%n", min, min.length());
        System.out.printf("Самая длинная: %s (%d)%n", max, max.length());
    }
}
