package homework5.figures;

public class Triangle extends Figure {
    double a;
    double b;
    double c;
    boolean exists;

    public Triangle(double b, double a, double c) {
        if ((a + b > c) & (a + c > b) & (b + c > a)) {
            this.b = b;
            this.a = a;
            this.c = c;
            this.exists = true;
            System.out.printf("Создан треугольник со сторонами: %f, %f, %f%n", a, b, c);
        } else {
            System.out.println("Не бывает таких треугольников, вы шо????");
            this.exists = false;
        }
    }

    @Override
    double area() {
        if (this.exists) {
            double p = this.perimeter() / 2;
            //формула Герона первый раз в жизни пригодилась)))))
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            return 0;
        }
    }

    @Override
    double perimeter() {
        if (this.exists) {
            return a + b + c;
        } else {
            return 0;
        }
    }
}
