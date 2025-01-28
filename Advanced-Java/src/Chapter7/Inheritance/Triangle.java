package Chapter7.Inheritance;

public class Triangle extends Shape{
    private double side3;

    /**
     *
     */
    public Triangle() {
        super();
        this.side3 = 3;
    }

    /**
     * A constructor with
     * @param l
     * @param h
     * @param side3
     */
    public Triangle(double l,double h, double side3) {
        super(l, h);
        setSide3(side3);
    }

    /**
     *
     * @return
     */
    public double getSide3() {
        return side3;
    }

    /**
     *
     * @param side3
     */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /**
     *
     * @return
     */
    @Override
    public double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - length) * (semiPerimeter - width) * (semiPerimeter - side3));
    }

    /**
     *
     * @return
     */
    @Override
    public double getPerimeter() {
        return length + width + side3;
    }

    /**
     *
     */
    @Override
    public void display() {
        System.out.println("Details of " + this.getClass().getName());
        System.out.println("Length: " + this.length);
        System.out.println("height: " + this.width);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());
    }
}