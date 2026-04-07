package homework7;

import java.util.Scanner;

/* Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
меньше средней, а также их длину */

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            System.out.printf("Введите строку номер %d%n", i+1);
            strings[i] = scanner.nextLine();
        }
        double sum = 0;
        for (int i = 0; i < strings.length; i++) {
            sum += (double) strings[i].length();
        }
        double avg = sum / strings.length;
        System.out.printf("Средняя длина %f%n", avg);
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < avg) {
                System.out.printf("%s (%d)%n", strings[i], strings[i].length());
            }
        }
    }
}
