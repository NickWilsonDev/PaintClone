// package edu.wcu.cs.cs263.honors.gui.color

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
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

    /* JPanel for color preview */
    JPanel colorPreview;

    public ColorSelectionPanel() {
        super(new BorderLayout());
        //colorPreview = new JPanel();
        colorChooser = new JColorChooser(Color.white);
        colorChooser.getSelectionModel().addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent e) {
                    currentColor = colorChooser.getColor();
                    System.out.println(currentColor.toString());
                    //colorPreview.set
                    //colorChooser.setPreviewPanel(colorPreview);

        colorChooser.setPreviewPanel(colorPreview);
                    //colorPreview.updateUI();
                }
            });

           

        //add(colorPreview);

        add(colorChooser, BorderLayout.PAGE_END);
    }

    protected void removeColorChangeListener(ColorChangeListener ccl) {
        //todo remove ccl from list of ccls
    }

    /**
     * This method will add the specified ColorChangeListener to the List of
     * ColorChangeListeners maintained by this class.
     *
     * @param ccl - a ColorChangeListener that will be added to the list
     */
    protected void addColorChangeListener(ColorChangeListener ccl) {
        // todo
    }

    /**
     * This method returns the currently selected color.
     */
    protected Color getSelectedColor() {
        return colorChooser.getColor();
    }

    /**
     * This protected method loops over all attached ColorChangeListeners and
     * notifies them of the change in color.
     *
     * @param color - type Color that has been changed
     */
    protected void notifyColorChange(Color color) {
        //todo
    }
}
