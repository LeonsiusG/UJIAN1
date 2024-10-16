package UJIAN;

abstract class Shape {
    String name;
    String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    abstract void print();
    abstract double area();
}
