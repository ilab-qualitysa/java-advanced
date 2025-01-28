package Chapter7.Inheritance;

public class Circle extends Shape{

    public Circle() {
        this.length = 5;
    }

    public Circle(double r) {
        super(r,0);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.length,2);
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * (Math.PI * this.length));
    }

    @Override
    public void display() {
        System.out.println("Details of " + this.getClass().getName());
        System.out.println("Radius: " + this.length);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
