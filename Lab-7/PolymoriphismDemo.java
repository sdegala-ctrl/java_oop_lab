class Shape {
    void area() {
        System.out.println("Calculating area of a shape...");
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    void area() {
        System.out.println("Area of Circle: " + (Math.PI * r * r));
    }
}

class Rectangle extends Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (l * b));
    }
}

public class PolymoriphismDemo {
    public static void main(String[] args) {
        Shape s;
        s = new Circle(6.5);
        s.area();

        s = new Rectangle(5.2, 7.3);
        s.area();
    }
}