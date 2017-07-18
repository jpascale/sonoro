package view.gui;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Label extends JTextArea {

    public Label(String legend) {
        super(legend);
        try {
            InputStream is = new FileInputStream("resources/goticaBastard.ttf");
            Font GoticaBastard = Font.createFont(Font.TRUETYPE_FONT, is);
            GoticaBastard = GoticaBastard.deriveFont(22f);
            setForeground(Color.WHITE);
            setFont(GoticaBastard);

        } catch (FontFormatException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos graficos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
