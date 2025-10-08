class Shape {
    void area() {
        System.out.println("Calculating area of a shape...");
    }
}

class Rectangle extends Shape {
    double len, wid;

    Rectangle(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (len * wid));
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Shape s = new Rectangle(9.5, 4.2);
        s.area();
    }
}