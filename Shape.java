package edu.wcu.cs.cs263.honors.gui.shape;

import java.awt.Graphics;
import java.io.Serializable;

/**
 * @author Nick Wilson
 * @version 11.7.15
 *
 * Shape defines the interface of shapes that can draw themselves. This 
 * interface extends the Serializable interface - all shapes must serializable.
 */
public interface Shape extends Serializable {
    public void draw(Graphics g);
}
