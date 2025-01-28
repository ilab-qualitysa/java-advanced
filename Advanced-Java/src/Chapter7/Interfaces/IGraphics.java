package Chapter7.Interfaces;

import java.awt.*;

/**
 * Interface for drawing and applying paint on an object/Shape
 */
public interface IGraphics {
    /**
     * Draw a Shape
     */
    void draw();

    /**
     * Apply color on an object
     * @param color Color to be applied on an object
     */
    void applyPaint(Color color);
}
