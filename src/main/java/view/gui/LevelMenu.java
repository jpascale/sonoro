package view.gui;

import model.Game;
import model.board.level.*;
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
		lb1.setBounds(135, 150, 150, 50);
	    lb1.addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent me) { 
	        	  LevelMenu.this.setVisible(false);
	        	  LevelMenu.this.ogg.stop();
	        	  
	        	  try {
                      SoundMaker.getInstance().effect(FX.CLICK);
	        		  Main mainWindow = new Main(new Game(GameLevelY.class,1));
	        		  mainWindow.setVisible(true);
	        	  } catch (InstantiationException | IllegalAccessException e) {
	        		  JOptionPane.showMessageDialog(null, "Error al cargar datos del nivel", "Error", JOptionPane.ERROR_MESSAGE);
	        	  }
	      		  
	          }
	    });
	    
	    
	    LevelButtons lb2 = new LevelButtons("2");
		lb2.setBounds(135, 180, 150, 50);
	    
	    
	    lb2.addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent me) { 
	        	  LevelMenu.this.setVisible(false);
	        	  LevelMenu.this.ogg.stop();
	        	  
	        	  try {
                      SoundMaker.getInstance().effect(FX.CLICK);
	        		  Main mainWindow = new Main(new Game(GameLevelZ.class,2));
	        		  mainWindow.setVisible(true);
	        	  } catch (InstantiationException | IllegalAccessException e) {
	        		  JOptionPane.showMessageDialog(null, "Error al cargar datos del nivel", "Error", JOptionPane.ERROR_MESSAGE);
	        	  }
	      		  
	          }
	    });

        LevelButtons lb3 = new LevelButtons("3");
        lb3.setBounds(135, 210, 150, 50);
        lb3.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                LevelMenu.this.setVisible(false);
                LevelMenu.this.ogg.stop();
                try {
                    SoundMaker.getInstance().effect(FX.CLICK);
                    Main mainWindow = new Main(new Game(GameLevelZ.class,3));
                    mainWindow.setVisible(true);
                } catch (InstantiationException | IllegalAccessException e) {
                    JOptionPane.showMessageDialog(null, "Error al cargar datos del nivel", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

		LevelButtons lb4 = new LevelButtons("4");
		lb4.setBounds(135, 240, 150, 50);
		lb4.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				LevelMenu.this.setVisible(false);
				LevelMenu.this.ogg.stop();
				try {
					SoundMaker.getInstance().effect(FX.CLICK);
					Main mainWindow = new Main(new Game(GameLevel4.class,4));
					mainWindow.setVisible(true);
				} catch (InstantiationException | IllegalAccessException e) {
					JOptionPane.showMessageDialog(null, "Error al cargar datos del nivel", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		LevelButtons lb5 = new LevelButtons("5");
		lb5.setBounds(135, 270, 150, 50);


		lb5.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				LevelMenu.this.setVisible(false);
				LevelMenu.this.ogg.stop();

				try {
					SoundMaker.getInstance().effect(FX.CLICK);
					Main mainWindow = new Main(new Game(GameLevel5.class,5));
					mainWindow.setVisible(true);
				} catch (InstantiationException | IllegalAccessException e) {
					JOptionPane.showMessageDialog(null, "Error al cargar datos del nivel", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		LevelButtons lb6 = new LevelButtons("6");
		lb6.setBounds(235, 150, 150, 50);


		lb6.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				LevelMenu.this.setVisible(false);
				LevelMenu.this.ogg.stop();

				try {
					SoundMaker.getInstance().effect(FX.CLICK);
					Main mainWindow = new Main(new Game(GameLevel6.class,6));
					mainWindow.setVisible(true);
				} catch (InstantiationException | IllegalAccessException e) {
					JOptionPane.showMessageDialog(null, "Error al cargar datos del nivel", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		LevelButtons lb7 = new LevelButtons("7");
		lb7.setBounds(235, 180, 150, 50);


		lb7.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				LevelMenu.this.setVisible(false);
				LevelMenu.this.ogg.stop();

				try {
					SoundMaker.getInstance().effect(FX.CLICK);
					Main mainWindow = new Main(new Game(GameLevel7.class,7));
					mainWindow.setVisible(true);
				} catch (InstantiationException | IllegalAccessException e) {
					JOptionPane.showMessageDialog(null, "Error al cargar datos del nivel", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		LevelButtons lb8 = new LevelButtons("8");
		lb8.setBounds(235, 210, 150, 50);


		lb8.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				LevelMenu.this.setVisible(false);
				LevelMenu.this.ogg.stop();

				try {
					SoundMaker.getInstance().effect(FX.CLICK);
					Main mainWindow = new Main(new Game(GameLevel8.class,8));
					mainWindow.setVisible(true);
				} catch (InstantiationException | IllegalAccessException e) {
					JOptionPane.showMessageDialog(null, "Error al cargar datos del nivel", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		LevelButtons lb9 = new LevelButtons("9");
		lb9.setBounds(235, 240, 150, 50);


		lb9.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				LevelMenu.this.setVisible(false);
				LevelMenu.this.ogg.stop();

				try {
					SoundMaker.getInstance().effect(FX.CLICK);
					Main mainWindow = new Main(new Game(GameLevel9.class,9));
					mainWindow.setVisible(true);
				} catch (InstantiationException | IllegalAccessException e) {
					JOptionPane.showMessageDialog(null, "Error al cargar datos del nivel", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		LevelButtons lb10 = new LevelButtons("10");
		lb10.setBounds(235, 270, 150, 50);


		lb10.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				LevelMenu.this.setVisible(false);
				LevelMenu.this.ogg.stop();

				try {
					SoundMaker.getInstance().effect(FX.CLICK);
					Main mainWindow = new Main(new Game(GameLevel10.class,10));
					mainWindow.setVisible(true);
				} catch (InstantiationException | IllegalAccessException e) {
					JOptionPane.showMessageDialog(null, "Error al cargar datos del nivel", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});



        add(lb3);
	    add(lb1);
	    add(lb2);

		add(lb4);
		add(lb5);
		add(lb6);
		add(lb7);
		add(lb8);
		add(lb9);
		add(lb10);
	    
	    try {
			this.ogg = new OggClip(new FileInputStream("resources/intro.ogg"));
			this.ogg.loop();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error al cargar audio", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
