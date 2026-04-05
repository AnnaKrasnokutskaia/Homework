package homework6;

/* Продемонстрировать обработку исключительных ситуаций на примерах */

public class Task1 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Triangle triangle2 = new Triangle();

        System.out.println("1. Multi-catch:");
        triangle.setSides(new int[]{3, 4}); // короткий массив
        triangle.setSides(new int[]{1, 2, 10}); // невалидный треугольник
        triangle.setSides(new int[]{3, 4, 5}); // нормальный
        System.out.println();

        System.out.println("2. Несколько catch:");
        //вот тут ввести фигню, чтобы потом поймать исключение в площади
        //ловится невалидный треугольник и не целые числа
        triangle2.setSidesFromKeyboard();
        System.out.println();

        System.out.println("3. Один catch:");
        triangle.getSide(1);
        triangle.getSide(5);
        System.out.println();

        System.out.println("4. try-catch-finally:");
        triangle2.calculateArea(); // стороны не заданы
        triangle.calculateArea();  // нормальные стороны
    }

}
