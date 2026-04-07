package homework5.figures;

public class Triangle extends Figure {
    double[] sides = new double[3];
    boolean exists;

    public Triangle(double b, double a, double c) {
        try {
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new InvalidTriangleException("Стороны должны быть положительными");
            }

            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new InvalidTriangleException("Такого треугольника не существует");
            }

            sides = new double[]{a, b, c};
            exists = true;
            System.out.printf("Создан треугольник со сторонами: %f, %f, %f%n", a, b, c);
        } catch (ArrayIndexOutOfBoundsException | InvalidTriangleException e) {
            System.out.println("Ошибка при задании сторон: " + e.getMessage());
            sides = null;
            exists = false;
        }
    }

    @Override
    double area() {
        if (this.exists) {
            double p = this.perimeter() / 2;
            //формула Герона первый раз в жизни пригодилась)))))
            return Math.sqrt(p * (p - this.sides[0]) * (p - this.sides[1]) * (p - this.sides[2]));
        } else {
            return 0;
        }
    }

    @Override
    double perimeter() {
        if (this.exists) {
            return this.sides[0] + this.sides[1] + this.sides[2];
        } else {
            return 0;
        }
    }
}
