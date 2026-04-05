package homework5.figures;

public class Circle extends Figure {
    double r;

    public Circle(double r) {
        this.r = r;
        System.out.println("Создан круг радиуса " + r);
    }

    @Override
    double area() {
        return Math.PI * r * r;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * r;
    }
}
