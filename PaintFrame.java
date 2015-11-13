/////package edu.wcu.cs.cs263.honors.gui;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 * @author Nick Wilson
 * @version 11.7.15
 *
 * Class extends JFrame and serves as the "main window" of the application. The
 * class is responsible for coordinating the high-level behavior of the 
 * application.
 */
public class PaintFrame extends JFrame {
    //todo
    
    /* Title */
    String title;

    /* Layout manager */
    GridLayout layout;

    /* Menu bar */
    PaintMenu menu;

    /* Color selection panel */
    ColorSelectionPanel colorPanel;

    /**
     * Constructor will set appropriate frame title, set an appropriate layout
     * manager, create and add sub-components, create and add the menu bar, and
     * create and add needed listeners.
     */
    public PaintFrame(String title) {
        this.title = title;

        setTitle(title);
        layout = new GridLayout(2, 2);

        colorPanel = new ColorSelectionPanel();

        // menu stuff
        menu = new PaintMenu();
        setJMenuBar(menu);

        add(colorPanel, 0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

        setSize(400, 250);
        setVisible(true);
    }
}
