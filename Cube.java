package UJIAN;

class Cube extends Shape {
    int height;

    public Cube(String name, String color, int height) {
        super(name, color);
        this.height = height;
    }

    @Override
    void print() {
        System.out.println("Cube: " + name + ", Color: " + color);
    }

    @Override
    double area() {
        return 6 * height * height; // Surface area of a cube
    }
}

