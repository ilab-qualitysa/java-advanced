package Chapter7.Inheritance;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape objShape = new Shape(8,7);
        objShape.display();;
        System.out.println("=========================================================================================");
        MyRectangle objRec = new MyRectangle(4,3);
        objRec.display();
        System.out.println("==============================");
        Circle objCircle = new Circle(5);
        objCircle.display();
        System.out.println("==============================");
        Triangle objTriangle = new Triangle(3,4,5);//5,6,7
        objTriangle.display();
    }
}
