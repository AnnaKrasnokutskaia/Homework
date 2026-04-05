package homework5.figures;

/* Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра(используя абстрактный класс/методы). Создать массив из 5 разных
фигур. Вывести на экран сумму периметра всех фигур в массиве */

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Circle(5);
        figures[1] = new Rectangle(1,10);
        figures[3] = new Triangle (5, 4,3);
        figures[2] = new Triangle (1,1, 5);
        figures[4] = new Circle(3);
        double sumPerimeter = 0;
        double sumArea = 0;
        for (int i = 0; i < figures.length; i++) {
            sumPerimeter += figures[i].perimeter();
            sumArea += figures[i].area();
        }
        System.out.println("Сумма периметров всех фигур: " + sumPerimeter);
        System.out.println("Сумма площадей всех фигур: " + sumArea);
    }
}
