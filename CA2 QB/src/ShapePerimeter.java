class Shape {
    protected String name;

    Shape(String name) {
        this.name = name;
    }

    void describe() {
        System.out.println("Shape Name : " + name);
    }
}

class Circle extends Shape {
    private int radius;

    Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    void describe() {
        super.describe();

        double area = Math.PI * radius * radius;
        System.out.println("Area : " + area);
    }
}

public class ShapePerimeter {
    public static void main(String[] args) {
        Circle c = new Circle("Circle", 2);
        c.describe();
    }
}