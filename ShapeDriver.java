package UJIAN;

import java.util.Scanner;

public class ShapeDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Inputan untuk Rectangle
        System.out.print("Enter Rectangle name: ");
        String rectName = scanner.nextLine();
        System.out.print("Enter Rectangle color: ");
        String rectColor = scanner.nextLine();
        System.out.print("Enter Rectangle length: ");
        int rectLength = scanner.nextInt();
        System.out.print("Enter Rectangle width: ");
        int rectWidth = scanner.nextInt();
        Rectangle rectangle = new Rectangle(rectName, rectColor, rectLength, rectWidth);

        //Inputan untuk Circle
        scanner.nextLine(); // Clear the buffer
        System.out.print("Enter Circle name: ");
        String circleName = scanner.nextLine();
        System.out.print("Enter Circle color: ");
        String circleColor = scanner.nextLine();
        System.out.print("Enter Circle radius: ");
        int circleRadius = scanner.nextInt();
        Circle circle = new Circle(circleName, circleColor, circleRadius);

        //Inputan untuk Cube
        scanner.nextLine(); // Clear the buffer
        System.out.print("Enter Cube name: ");
        String cubeName = scanner.nextLine();
        System.out.print("Enter Cube color: ");
        String cubeColor = scanner.nextLine();
        System.out.print("Enter Cube height: ");
        int cubeHeight = scanner.nextInt();
        Cube cube = new Cube(cubeName, cubeColor, cubeHeight);

        System.out.println("\nShape Information and Areas:");
        rectangle.print();
        System.out.println("Area: " + rectangle.area());
        circle.print();
        System.out.println("Area: " + circle.area());
        cube.print();
        System.out.println("Surface Area: " + cube.area());
        
        scanner.close();
    }
}

