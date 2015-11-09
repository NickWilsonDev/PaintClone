package edu.wcu.cs.cs263.honors.gui.shape.producer;

/**
 * @author Nick Wilson
 * @version 11.7.15
 *
 * Defines the interface to objects that can create shapes.
 */

public interface ShapeCreationListener {
    public void shapeCreated(Shape shape);
    public void shapeInProgress(Shape shape);
}
