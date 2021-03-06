//package edu.wcu.cs.cs263.honors.gui.shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * @author Nick Wilson
 * @version 11.15.15
 *
 * The FilledOval class extends AbstractTwoPointsShape and provides the
 * code necessary to draw a filled oval between two points with a specified 
 * drawing color.
 */
public class FilledOval extends AbstractTwoPointsShape {


    /**
     * Constructor initializes fields for class, but this one just calls the
     * Super class's constructor.
     *
     * @param
     *  color - type Color
     *  start - starting Point
     *  end   - ending Point
     */
    public FilledOval(Color color, Point start, Point end) {
        super(color, start, end);
    }

    /**
     * Method provides logic to draw a FilledOval between two points.
     *
     * @param
     *  g - type Graphics
     */
    public void draw(Graphics g) {
        int width = getStart().x + getEnd().x;
        // may need if conditions for negative values
        int height = getStart().y + getEnd().y;
        g.fillOval(getStart().x, getStart().y, width, height);
    }
}
