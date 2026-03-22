package homework3_1;

import java.util.Random;
import java.util.Scanner;

/* Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
строкой и т. д.) */

public class Practice3_5 {
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
        // и ведь наверняка можно было подключить какую-нибудь библиотеку, где это делается в одну строку...

        int[][] transponedMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transponedMatrix[j][i] = matrix[i][j];
            }
        }

        // вывод
        System.out.println("транспонированная матрица");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d ", transponedMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
