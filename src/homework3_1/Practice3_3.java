package homework3_1;

import java.util.Random;
import java.util.Scanner;

/*Проверить произведение элементов какой диагонали больше.*/

public class Practice3_3 {
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

        int mainProduct = 1;
        int secondaryProduct = 1;

        for (int i = 0; i < n; i++) {
            mainProduct *= matrix[i][i];
            secondaryProduct *= matrix[i][n - 1 - i];
        }

        if (mainProduct > secondaryProduct) {
            System.out.println("Больше произведение главной диагонали");
        } else if (mainProduct < secondaryProduct) {
            System.out.println("Больше произведение побочной диагонали");
        } else {
            System.out.println("Произведения равны");
        }
    }
}
