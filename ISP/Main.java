package ISP;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        System.out.println("Rectangle Area = " + rectangle.area(10, 5));

        Square square = new Square();
        System.out.println("Square Area = " + square.area(6));

        Cube cube = new Cube();
        System.out.println("Cube Surface Area = " + cube.area(4, 4));
        System.out.println("Cube Volume = " + cube.volume(4, 4, 4));
    }
}