package Chapter7.Abstraction;

public class Square extends Shape{
    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }
}
