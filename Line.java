//package edu.wcu.cs.cs263.honors.gui.shape;

import java.awt.Color;
import java.awt.Point;

/**
 * @author Nick Wilson
 * @version 11.7.15
 *
 * The Line class extends AbstractTwoPointsShape and provides the code
 * necessary to draw a line between two points with a specified drawing color.
 */
public class Line extends AbstractTwoPointsShape {


    /**
     * Constructor initializes fields for class.
     */
    public Line(Color color, Point start, Point end) {
        super(color, start, end);
        //this.color = color;
        //this.start = start;
        //this.end   = end;
    }
}
