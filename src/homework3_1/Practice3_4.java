package homework3_1;

import java.util.Random;
import java.util.Scanner;

/* Посчитать сумму четных элементов стоящих над побочной диагональю (не
включительно) */

public class Practice3_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер матрицы:");
        int n = scanner.nextInt();

        Random random = new Random();

        int[][] matrix = new int[n][n];

        // заполнение
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(51);
            }
        }

        // вывод
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d ", matrix[i][j]);
            }
            System.out.println();
        }

        // решение задачи

        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if ((i + j < n - 1) && (matrix[i][j] % 2 == 0)) {
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("Сумма: " + sum);
    }
}
