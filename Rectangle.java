package UJIAN;

class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle(String name, String color, int length, int width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    @Override
    void print() {
        System.out.println("Rectangle: " + name + ", Color: " + color);
    }

    @Override
    double area() {
        return length * width;
    }
}
