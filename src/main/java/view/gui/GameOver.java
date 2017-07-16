package view.gui;

import model.Game;
import sound.FX;
import sound.SoundMaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameOver extends JFrame {

	private static final long serialVersionUID = 1L;


	public GameOver(Game game){
		super("Game Over");
	    Toolkit toolkit = getToolkit();
	    Dimension size = toolkit.getScreenSize();
	    this.setSize(198, 98);
	    this.setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
	    this.setResizable(false);
	    this.setAlwaysOnTop(true);
	    
	    setContentPane(new JLabel(new ImageIcon("resources/gameover.png")));
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SoundMaker.getInstance().stopMusic();
        SoundMaker.getInstance().effect(FX.LOSE);

		this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    Process proc = Runtime.getRuntime().exec("java -jar game.jar");
                } catch (Exception ex){
                    ex.printStackTrace();
                }
                return;
            }
		});
	}
}
