// package edu.wcu.cs.cs263.honors.gui;

import java.io.File;
import java.util.LinkedList;
import java.util.Stack;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author Nick Wilson
 * @version 11.15.15
 *
 * DrawPanel.java
 * This class extends JPanel and implements ShapeCreationListener. The class
 * serves as the component that is notified of the creation of new shapes and
 * paints all drawn shapes. Instances of this class serve as observers in
 * instances of the Observer design pattern. The interesting state in which
 * this object is interested is the creation of new shapes. Instances of this
 * class will maintain a List of Shapes that corresponds to the shapes that
 * are to be painted on this panel. Instances will also maintain state that
 * reflects the ShapeProducer for the currently selected shape, the Color for
 * the currently selected drawing coor, and a Stack of Drawing Mementos that
 * will be used for "undo" and "redo" operations.
 * The ShapeProducer implements the logic associated with observing the state
 * of the mouse (i.e. ShapeProducers are MouseListeners and 
 * MouseMotionListeners). The current ShapeProducer will observe the mouse
 * state of the DrawPanel.
 */

public class DrawPanel extends JPanel implements ShapeCreationListener {
    
    /* A list of shapes that will be painted on this panel */
    LinkedList<Shape> listOfShapes; 

    /* maintain state that reflects the ShapeProducer for currently selected
     * Shape
     */
    //todo

    /* currently selected color */
    Color currentColor;

    /* Shape currently being drawn */
    Shape currentlyDrawingShape;

    /* Stack of DrawingMementos used for 'redo' and 'undo' operations */
    Stack<DrawingMemento> stackOfMementos;

    /**
     * The constructor for this class will set its background color to 
     * specified color.
     *
     * @param background - Color that the background will be set too.
     */
    public DrawPanel(Color background) {
        //todo
    }


    /**
     * This method will remove the old ShapeProducer as a listener for mouse
     * events associated with the DrawPanel and will add the new producer as a
     * listener for the mouse events.
     *
     * @param
     *  newProducer - type ShapeProducer, will be added as the new listener for
     *                mouse events.
     */
    protected void setShapeProducer(ShapeProducer newProducer) {
        //todo
    }

    /**
     * This method will save current drawing color, and will notify the current
     * ShapeProducer of the new draw color.
     *
     * @param
     *  drawColor - type Color, the new current drawing color
     */
    protected void setDrawColor(Color drawColor) {
        currentColor = drawColor;
        //todo notify current ShapeProducer
    }

    /**
     * This method is part of the implementation of the ShapeCreationListener
     * interface. It is called by the associated ShapeProducer when the 
     * specified when the specified shape has been drawn. This new shape should
     * be added to the list of shapes to be drawn. After this method is called
     * any undone operations will be lost.
     *
     * @param
     *  shape - type Shape, that has been drawn
     */
    public void shapeCreated(Shape shape) {
        //todo
    }

    /**
     * This method is part of the implementation of the ShapeCreationListener
     * interface. It is called by the associated ShapeProducer when the 
     * specified shape is currently being drawn. This shape is not a final
     * shape - it is only an intermediate shape as the mouse is being dragged.
     *
     * @param
     *  shape - type Shape, the shape that is being specified by the user as
     *          the mouse is being dragged
     */
    public void shapeinProgress(Shape shape) {
        //todo
    }

    /**
     * This method serializes the List of Shapes to the specified file.
     *
     * @param
     *  file - type File that is specified to hold list of Shapes
     */
    protected void save(File file) {
        //todo
    }

    /**
     * This method reads a serialized List of Shapes from the specified file.
     * And replaces the current list maintained by the object with the loaded
     * list.
     *
     * @param
     *  file - type File that holds a list of Shapes
     */
    protected void load(File file) {
        //todo
    }

    /**
     * Method clears list of Shapes maintained by this object.
     */
    protected void clear() {
        //todo
    }

    /**
     * Method returns true if an undo() operation on this object is possible.
     *
     * @return
     *  boolean - true if undo() is possible, false otherwise
     */
    protected boolean canUndo() {

        //todo
    }

    /**
     * Method returns true if an redo() operation on this object is possible.
     *
     * @return
     *  boolean - true if redo() is possible, false otherwise
     */
    protected boolean canRedo() {

        //todo
    }

    /**
     * Method undoes the last draw operation. The old draw state is maintained
     * using the Memento Design Pattern. This method creates a DrawingMemento
     * that represents the current state fo the drawing, pushes the memento on
     * the stack of DrawingMemento's, and removes the last shape that was
     * added to the list of shapes.
     */
    protected void undo() {
        //todo
    }

    /**
     * Method redoes the last undone operation. Pops a DrawingMemento from the
     * stack of DrawingMemento, and restores the list of Shapes from that
     * memento.
     */
    protected void redo() {
        //todo
    }

    /**
     * Mehtod draws all shapes in the list of Shape and the current shape in
     * progress (if one exists).
     *
     * @param
     *  g - type Graphics
     */
    protected void paintComponent(Graphics g) {
        //todo
    }
}
