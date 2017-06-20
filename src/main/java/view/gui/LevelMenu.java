package view.gui;

import model.Game;
import model.board.level.GameLevelY;
import model.board.level.GameLevelZ;
import sound.FX;
import sound.OggClip;
import sound.SoundMaker;
import view.Main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class LevelMenu extends JFrame {

	private OggClip ogg;

	private static final long serialVersionUID = 1L;
	
	public LevelMenu(){
		super("Desktop Dungeon");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setResizable(false);
	    Toolkit toolkit = getToolkit();
	    Dimension size = toolkit.getScreenSize();
	    this.setSize(512, 393);
	    this.setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);

	    setContentPane(new JLabel(new ImageIcon("resources/mainMenu.png")));
	   
	    File sourceimage = new File("resources/icon.png");
		try {
			Image image = ImageIO.read(sourceimage);
			this.setIconImage(image);
		} catch (IOException e1) {
			JOptionPane.showMessageDialog(null, "Error al cargar datos visuales", "Error", JOptionPane.ERROR_MESSAGE);
		}
	    
	    LevelButtons lb1 = new LevelButtons("1");
		lb1.setBounds(185, 170, 150, 50);
	    
	    
	    lb1.addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent me) { 
	        	  LevelMenu.this.setVisible(false);
	        	  LevelMenu.this.ogg.stop();
	        	  
	        	  try {
                      SoundMaker.getInstance().effect(FX.CLICK);
	        		  Main mainWindow = new Main(new Game(GameLevelY.class));
	        		  mainWindow.setVisible(true);
	        	  } catch (InstantiationException | IllegalAccessException e) {
	        		  JOptionPane.showMessageDialog(null, "Error al cargar datos del nivel", "Error", JOptionPane.ERROR_MESSAGE);
	        	  }
	      		  
	          }
	    });
	    
	    
	    LevelButtons lb2 = new LevelButtons("2");
		lb2.setBounds(185, 220, 150, 50);
	    
	    
	    lb2.addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent me) { 
	        	  LevelMenu.this.setVisible(false);
	        	  LevelMenu.this.ogg.stop();
	        	  
	        	  try {
                      SoundMaker.getInstance().effect(FX.CLICK);
	        		  Main mainWindow = new Main(new Game(GameLevelZ.class));
	        		  mainWindow.setVisible(true);
	        	  } catch (InstantiationException | IllegalAccessException e) {
	        		  JOptionPane.showMessageDialog(null, "Error al cargar datos del nivel", "Error", JOptionPane.ERROR_MESSAGE);
	        	  }
	      		  
	          }
	    });

        LevelButtons lb3 = new LevelButtons("3");
        lb3.setBounds(185, 270, 150, 50);
        lb3.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                LevelMenu.this.setVisible(false);
                LevelMenu.this.ogg.stop();
                try {
                    SoundMaker.getInstance().effect(FX.CLICK);
                    Main mainWindow = new Main(new Game(GameLevelZ.class));
                    mainWindow.setVisible(true);
                } catch (InstantiationException | IllegalAccessException e) {
                    JOptionPane.showMessageDialog(null, "Error al cargar datos del nivel", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(lb3);
	    add(lb1);
	    add(lb2);
	    
	    try {
			this.ogg = new OggClip(new FileInputStream("resources/intro.ogg"));
			this.ogg.loop();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error al cargar audio", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
