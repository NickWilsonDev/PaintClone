//package edu.wcu.cs.cs263.honors.gui.shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * @author Nick Wilson
 * @version 11.15.15
 *
 * NullShape.java
 * The NullShape class extends AbstractTwoPointsShape and implements the Null
 * Object Design Pattern.
 */
public class NullShape implements Shape {


    /**
     * Constructor implements Null Object design pattern.
     */
    public NullShape() {
    }

    /**
     * Method does nothing.
     *
     * @param
     *  g - type Graphics
     */
    public void draw(Graphics g) {
        
    }
}
