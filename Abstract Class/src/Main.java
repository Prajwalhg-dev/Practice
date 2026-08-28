//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Abstract class Shape
abstract class Shape {
    abstract double area();
    abstract double perimeter();
    void display() {
        System.out.println("This is a shape.");
    }
    public static void main(String[] args) {
        System.out.println("Main method inside Shape class.");
    }
}