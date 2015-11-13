
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 * @author Nick Wilson
 * @version 11.12.15
 *
 * PaintMenu.java
 *
 * This class implements a menubar for use in the PaintClone.
 */

public class PaintMenu extends JMenuBar {

    /* Menu for file options */
    JMenu fileMenu;

    /* Menu for edit options */
    JMenu editMenu;

    /* Menu for Help options */
    JMenu helpMenu;


    /* Menu items */
    JMenuItem save;
    JMenuItem open;
    JMenuItem exit;

    JMenuItem undo;
    JMenuItem redo;
    JMenuItem clear;

    public PaintMenu() {
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        /* initialize menu items */
        save = new JMenuItem("Save", KeyEvent.VK_S);
        open = new JMenuItem("Open", KeyEvent.VK_O);
        exit = new JMenuItem("Exit", KeyEvent.VK_X);

        undo = new JMenuItem("Undo", KeyEvent.VK_U);
        redo = new JMenuItem("Redo", KeyEvent.VK_R);
        clear = new JMenuItem("Clear", KeyEvent.VK_C);

        /* add listeners */
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });



        fileMenu.add(save);
        fileMenu.add(open);
        fileMenu.add(exit);

        editMenu.add(undo);
        editMenu.add(redo);
        editMenu.add(clear);

        add(fileMenu);
        add(editMenu);
        add(helpMenu);
    }
}
