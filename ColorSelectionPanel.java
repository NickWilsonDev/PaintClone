// package edu.wcu.cs.cs263.honors.gui.color

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

/**
 * @author Nick Wilson
 * @version 11.12.15
 *
 * ColorSelectionPanel.java
 *
 * The ColorSelectionPanel class extends JPanel an serves as a container and
 * coordinator of the visual components used to select the color with which
 * users wish to draw. Instances of this class serve as subjects in instances
 * of the Observer design pattern. The interesting state of these objects is
 * the currently selected color. Observers will be notified when users select
 * the colors in the panel.
 * Instances of this class will maintain a JColorChooser that provides the
 * color selection component, a JPanel that will provide a preview of the 
 * currently selected color, and a ColorSelectionModel that provides a method
 * to get the currently selected color. The ColorSelectionModel will also act
 * as the subject in the instance of the observer pattern. The model can have
 * a ChangeListener attached to it, that notifies registered observers when a
 * new color is selected.
 * Instances will also maintain a List of ColorChangeListeners. When the user
 * changes the selected color, each attached ColorChangeListener will be 
 * notified of the change.
 */
public class ColorSelectionPanel extends JPanel {

    /* JColorChooser */
    JColorChooser colorChooser;

    /* Current Color */
    Color currentColor;

    public ColorSelectionPanel() {
        super(new BorderLayout());

        colorChooser = new JColorChooser();
        

        colorChooser.setPreviewPanel(new JPanel());

        add(colorChooser, BorderLayout.PAGE_END);
    }
}
