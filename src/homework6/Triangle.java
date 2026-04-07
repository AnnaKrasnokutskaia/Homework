package homework6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    private int[] sides = new int[3];

    public int[] getSides() {
        return sides;
    }

    //try -catch, с использованием multi - catch
    public void setSides(int[] input) {
        try {
            int a = input[0];
            int b = input[1];
            int c = input[2];

            if (a <= 0 || b <= 0 || c <= 0) {
                throw new InvalidTriangleException("Стороны должны быть положительными");
            }

            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new InvalidTriangleException("Такого треугольника не существует");
            }

            sides = new int[]{a, b, c};
            System.out.println("Стороны успешно заданы");
        } catch (ArrayIndexOutOfBoundsException | InvalidTriangleException e) {
            System.out.println("Ошибка при задании сторон: " + e.getMessage());
            sides = null;
        }
    }
    //try-catch, где catch будет несколько
    public void setSidesFromKeyboard() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите первую сторону:");
            int a = scanner.nextInt();

            System.out.println("Введите вторую сторону:");
            int b = scanner.nextInt();

            System.out.println("Введите третью сторону:");
            int c = scanner.nextInt();

            if (a <= 0 || b <= 0 || c <= 0) {
                throw new InvalidTriangleException("Стороны должны быть положительными");
            }

            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new InvalidTriangleException("Такого треугольника не существует");
            }

            sides = new int[]{a, b, c};
            System.out.println("Стороны успешно введены с клавиатуры");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: нужно вводить целые числа");
            sides = null;
        } catch (InvalidTriangleException e) {
            System.out.println("Ошибка: " + e.getMessage());
            sides = null;
        }
    }
    //try-catch
    public void getSide(int index) {
        try {
            System.out.println("Сторона по индексу " + index + ": " + sides[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: такого индекса нет");
        }
    }
    // try-catch-finally
    public void calculateArea() {
        double area = 0;

        try {
            double a = sides[0];
            double b = sides[1];
            double c = sides[2];

            double p = (a + b + c) / 2;
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } catch (NullPointerException e) {
            System.out.println("Ошибка: стороны треугольника не заданы");
            area = 0;
        } finally {
            System.out.println("Площадь треугольника: " + area);
        }
    }

}
