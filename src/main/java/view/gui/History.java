package view.gui;

import javax.swing.*;
import java.awt.*;

public class History extends JFrame {

    public History(String legend) {
        super("Desktop Dungeon");

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        this.setSize(612, 493);
        this.setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        this.setResizable(false);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        JLabel label = new Label(legend);
        label.setBounds(0, 0, 612, 470);
        label.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
        label.setHorizontalAlignment(SwingConstants.LEFT);
        label.setVerticalAlignment(SwingConstants.TOP);
        add(label);
    }
}
