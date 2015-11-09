package edu.wcu.cs.cs263.honors.gui.shape.producer;

import java.awt.event.MouseAdapter;
import java.util.LinkedList;

/**
 * @author Nick Wilson
 * @version 11.7.15
 *
 * AbstractShapeProducer is an abstract class that extends MouseAdapter and
 * implements ShapeProducer. This class includes all functionality that is 
 * common to all shape producers. It maintains a List of ShapeCreationListener
 * and provides methods to notify these observers about the creation of new
 * shapes. It also maintains the color with which newly produced shapes will be
 * drawn.
 */
abstract class AbstractShapeProducer extends MouseAdapter implements ShapeProducer{

    private LinkedList<ShapeCreationListener> listeners = new 
                                           LinkedList<ShapeCreationListener>();

    private Color drawColor;

    public void setDrawColor(Color color) {
        drawColor = color;
    }

    public Color getDrawColor() {
        return drawColor;
    }

    public void addShapeCreationListener(ShapeCreationListener scl) {
        listeners.add(scl);
    }

    public void removeShapeCreationListener(ShapeCreationListener scl) {
        listeners.remove(scl);
    }

    protected void notifyShapeCreated(Shape shape) {
        // loops through list and notifies all listeners

    }

    protected void notifyShapeInProgress(Shape shape) {
        // loops through list and notifies all listeners

    }
}
