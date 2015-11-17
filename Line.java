//package edu.wcu.cs.cs263.honors.gui.shape;

import java.awt.Color;
import java.awt.Graphics;
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
     * Constructor initializes fields for class, but this one just calls the
     * Super class's constructor.
     *
     * @param
     *  color - type Color
     *  start - starting Point
     *  end   - ending Point
     */
    public Line(Color color, Point start, Point end) {
        super(color, start, end);
    }

    /**
     * Method provides logic to draw line between two points.
     *
     * @param
     *  g - type Graphics
     */
    public void draw(Graphics g) {
        g.drawLine(getStart().x, getStart().y, getEnd().x, getEnd().y);
    }
}
