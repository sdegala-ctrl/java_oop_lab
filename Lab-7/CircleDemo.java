abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

public class CircleDemo {  
    public static void main(String[] args) {
        Shape s = new Circle(7.5);
        s.area(); 

        if (s instanceof Circle) {
            System.out.println("s is a Circle object");
        }
    }
}