//package edu.wcu.cs.cs263.honors.gui.color;

import java.awt.Color;

/**
 * @author Nick Wilson
 * @version 11.7.15
 *
 * ColorChangeListener defines the interface to observer objects that are 
 * interested in receiving notifications about changes in the currently 
 * selected color in the ColorSelectionPanel.
 */
public interface ColorChangeListener {
    public void colorChange(Color color);
}
