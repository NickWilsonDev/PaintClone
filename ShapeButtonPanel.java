//package edu.wcu.cs.cs263.honors.gui;

import javax.swing.JPanel;

/**
 * @author Nick Wilson
 * @version 11.7.15
 *
 * ShapeButtonPanel.java
 * Class extends JPanel an serves as a container and coordinator of the buttons
 * used to select the type of drawing users wish to create. Instances of this
 * class serve as subjects in instances of the Observer design pattern. The
 * interesting state of these objects is the currently selected button. 
 * Observers will be notified when users select the buttons on the panel.
 */

public class ShapeButtonPanel extends JPanel {
    //todo

    /**
     * Constructor will set an appropriate layout manager, create and add
     * sub-components, and create and add needed listeners.
     */
    public ShapeButtonPanel() {
        //todo
    }

    /**
     * Method will return a ShapeProducer for the currently selected button.
     *
     * @return ShapeProducer 
     */
    protected ShapeProducer getShapeProducer() {

    }

    /**
     * Method will add the specified ButtonSelectionListener to the List of
     * ButtonSelectionListeners maintained by this class.
     */
    protected void addButtonSelectionListener(ButtonSelectionListener bsl) {

    }

    /**
     * Method will remove the specified ButtonSelectionListener from the List
     * of ButtonSelectionListeners maintained by this class.
     */
    protected void removeButtonSelectionListener(ButtonSelectionListener bsl) {

    }

    /**
     * This protected method loops over all attached ButtonSelectionListeners
     * and notifies them of the change in button selection.
     */
    protected void notifyButtonChange() {

    }

}
