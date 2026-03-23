package homework3_1;

import java.util.Random;
import java.util.Scanner;

/*Вывести нечетные элементы находящиеся под главной диагональю
(включительно).*/

public class Practice3_2 {
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

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (i >= j && matrix[i][j] % 2 != 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

        System.out.println();
    }
}
