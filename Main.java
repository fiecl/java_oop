abstract class Shape {
    // Properties
    protected String color;
    protected double area;

    // Constructor
    public Shape(String color) {
        this.color = color;
        this.area = calculateArea();
    }

    // Abstract method to be implemented by subclasses
    protected abstract double calculateArea();

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for area
    public double getArea() {
        return area;
    }

    // Setter for area
    public void setArea(double area) {
        this.area = area;
    }

    // Concrete method
    public void displayDetails() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        this.area = calculateArea(); // Calculate and set area in constructor
    }

    @Override
    protected double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
        this.area = calculateArea(); // Recalculate area when radius changes
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
        this.area = calculateArea(); // Calculate and set area in constructor
    }

    @Override
    protected double calculateArea() {
        return width * height;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
        this.area = calculateArea(); // Recalculate area when width changes
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
        this.area = calculateArea(); // Recalculate area when height changes
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        circle.displayDetails();
        
        circle.setRadius(7);
        circle.displayDetails();

        Rectangle rectangle = new Rectangle("Blue", 4, 3);
        rectangle.displayDetails();

        rectangle.setWidth(6);
        rectangle.setHeight(4);
        rectangle.displayDetails();
    }
}