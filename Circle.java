package UJIAN;

class Circle extends Shape {
    int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    void print() {
        System.out.println("Circle: " + name + ", Color: " + color);
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
