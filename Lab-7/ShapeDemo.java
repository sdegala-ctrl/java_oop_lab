class Shape {
    void area() {
        System.out.println("Calculating area of a shape...");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void area() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s;
        s = new Circle(6);
        s.area();
        s = new Rectangle(5, 9);
        s.area();
        s = new Triangle(8, 4);
        s.area();
    }
}