class Shape {
    void area() {
        System.out.println("Calculating area of a shape...");
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

public class TriangleDemo {
    public static void main(String[] args) {
        Shape s = new Triangle(10, 6);
        s.area();
    }
}