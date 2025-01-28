package Chapter7.Interfaces;

/**
 * Interface to calculate the area and perimeter of a Shape
 */
public interface IShape {
    /**
     * Calculate and return the area of a Shape
     * @return Area of the shape
     */
    double getArea();

    /**
     * Calculate and return the perimeter of a shape
     * @return Perimeter of a shape
     */
    double getPerimeter();
}
