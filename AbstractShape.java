//package edu.wcu.cs.cs263.honors.gui.shape;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Nick Wilson
 * @version 11.7.15
 *
 * AbstractShape is an abastract class that implements the Shape interface and
 * includes any shape functionality common to all shapes 
 * (ie, the color of the shape).
 */
public class AbstractShape implements Shape {

    /* color of the shape */
    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    /**
     * Method sets the color to the color specified in the constructor.
     * @param g - Graphics object.
     */
    public void draw(Graphics g) {
        g.setColor(color);
        // may need to change
    }
}
