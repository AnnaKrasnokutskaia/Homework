package homework3_1;

/*Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).*/

/*Посчитать сумму четных элементов стоящих на главной диагонали.*/

import java.util.Random;
import java.util.Scanner;

public class Practice3_1 {
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
        boolean hasEvenElements = false;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] % 2 == 0) {
                sum += matrix[i][i];
                hasEvenElements = true;
            }
        }
        if (hasEvenElements) {
            System.out.println("Сумма: " + sum);
        } else {
            System.out.println("Чётных элементов нет");
        }
    }
}
