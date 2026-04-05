package homework7;

import java.util.Scanner;

/* */

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите строку%n");
        String str = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result.append(c);
            result.append(c);
        }
        System.out.println(result);

    }
}
