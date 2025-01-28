package Chapter7.Interfaces;

import Chapter7.Inheritance.Shape;
import java.awt.*;

public class Square extends Shape implements IShape, IGraphics {
    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    /**
     * Draw a Shape
     */
    @Override
    public void draw() {

    }

    /**
     * Apply color on an object
     *
     * @param color Color to be applied on an object
     */
    @Override
    public void applyPaint(Color color) {

    }

    /**
     * Calculate and return the area of a Shape
     *
     * @return Area of the shape
     */
    @Override
    public double getArea() {
        return this.side * this.side;
    }

    /**
     * Calculate and return the perimeter of a shape
     *
     * @return Perimeter of a shape
     */
    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }
}
