package edu.wcu.cs.cs263.honors.gui.shape;

/**
 * @author Nick Wilson
 * @version 11.7.15
 *
 * AbstractTwoPointsShape is an abstract class that extends AbstractShape and
 * includes any shape functionality common to all shapes that can be expressed
 * by two points (ie, the starting and ending points).
 */
abstract class AbstractTwoPointsShape extends AbstractShape {
    
    /* Starting point */
    private Point start;

    /* Ending point */
    private Point end;

    /**
     * Constructor initializes fields for the object.
     *
     * @param
     *  color - Color, color of the shape.
     *  start - Point, starting point of the shape.
     *  end   - Point, ending point of the shape.
     */
    public AbstractTwoPointsShape (Color color, Point start, Point end) {
        this.color = color;
        this.start = start;
        this.end   = end;
    }

    /**
     * Method that returns starting Point of this two-point shape.
     *
     * @return Point - starting point of this shape.
     */
    protected Point getStart() {
        return start;
    }

    /**
     * Method that returns ending Point of this two-point shape.
     *
     * @return Point - ending point of this shape.
     */
    protected Point getEnd() {
        return end;
    }
}

