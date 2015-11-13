//package edu.wcu.cs.cs263.honors.gui.shape.producer;

import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * @author Nick Wilson
 * @version 11.7.15
 *
 * This interface defines the interface to objects that encapsulate the logic
 * necessary to produce shapes in response to mouse events. The ShapeProducer
 * interface extends both the MouseListener and MouseMotionListener interfaces.
 */

public interface ShapeProducer extends MouseListener, MouseMotionListener {
    public void addShapeCreationListener(ShapeCreationListener l);
    public boolean removeShapeCreationListener(ShapeCreationListener l);
    public void setDrawColor(Color drawColor);
}
