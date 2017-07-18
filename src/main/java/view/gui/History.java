package view.gui;

import javax.swing.*;
import java.awt.*;

public class History extends JFrame {

    public History(String legend) {
        super("Desktop Dungeon");

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        this.setSize(612, 235);
        this.setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        this.setResizable(false);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        JTextArea label = new Label(legend);
        label.setBounds(0, 0, 612, 190);
        //label.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));

        label.setEditable(false);
        label.setCursor(null);
        label.setOpaque(false);
        label.setFocusable(false);
        label.setLineWrap(true);
        label.setWrapStyleWord(true);
        
        add(label);
    }
}
