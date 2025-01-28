package Chapter7.Inheritance;

public class Shape {
    protected double length, width;

    /**
     *
     */
    public Shape(){
        this.length = 5;
        this.width = 7;
    }

    /**
     * Constructor to create Shape object with new length and width
     * @param length Length of the shape
     * @param width Width of the shape
     */
    public Shape(double length, double width){
        setLength(length);
        setWidth(width);
    }

    /**
     * Get length
     * @return the current length
     */
    public double getLength() {
        return length;
    }

    /**
     * Set the new length
     * @param length new length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * get width
     * @return the current width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set the new width
     * @param width new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void display(){
        System.out.println("Details of " + this.getClass().getName());
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());


    }
}
