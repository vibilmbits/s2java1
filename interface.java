import java.util.Scanner;

interface Prop {
    void getData();
    void area();
    void perimeter();
}

class Circle implements Prop {
    double pi = 3.14;
    double r;
    Scanner sc = new Scanner(System.in);

    @Override
    public void getData() {
        System.out.print("Enter the radius of the circle: ");
        r = sc.nextDouble();
    }

    @Override
    public void area() {
        System.out.println("Area of the circle: " + (pi * r * r));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of the circle: " + (2 * pi * r));
    }
}

class Rectangle implements Prop {
    double l, b;
    Scanner sc = new Scanner(System.in);

    @Override
    public void getData() {
        System.out.print("Enter the length of the rectangle: ");
        l = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        b = sc.nextDouble();
    }

    @Override
    public void area() {
        System.out.println("Area of the rectangle: " + (l * b));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of the rectangle: " + (2 * (l + b)));
    }
}

public class Prototype {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        do {
            System.out.println("\n1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    circle.getData();
                    circle.area();
                    circle.perimeter();
                    break;
                case 2:
                    rectangle.getData();
                    rectangle.area();
                    rectangle.perimeter();
                    break;
                case 3:
                    System.out.println("Exited...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        } while (true);
    }
}

