package view.gui;

import model.Game;
import model.board.level.*;
import sound.FX;
import sound.SoundMaker;
import view.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PlayerWin extends JFrame {

	private static final long serialVersionUID = 1L;


	public PlayerWin(Game game) throws IllegalAccessException, InstantiationException {
		super("Player Win");
	    Toolkit toolkit = getToolkit();
	    Dimension size = toolkit.getScreenSize();
	    this.setSize(198, 98);
	    this.setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
	    this.setResizable(false);
	    
	    setContentPane(new JLabel(new ImageIcon("resources/playerwin.png")));

		this.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{

				Main mainWindow = null;
				try {

					if(game.level == 1 ) {

						mainWindow = new Main(new Game(GameLevelY.class,2), "Level 2");
					}
					if(game.level  == 2 ) {
						mainWindow = new Main(new Game(GameLevelZ.class,3), "Level 3");
					}
					if(game.level == 3 ) {
						mainWindow = new Main(new Game(GameLevel4.class,4), "Level 4");
					}
					if(game.level  == 4 ) {
						mainWindow = new Main(new Game(GameLevel5.class,5), "Level 5");
					}
					if(game.level  == 5 ) {
						mainWindow = new Main(new Game(GameLevel6.class,6), "Level 6");
					}
					if(game.level  == 6 ) {
						mainWindow = new Main(new Game(GameLevel7.class,7), "Level 7");
					}
					if(game.level  == 7 ) {
						mainWindow = new Main(new Game(GameLevel8.class,8), "Level 8");
					}
					if(game.level == 8 ) {
						mainWindow = new Main(new Game(GameLevel9.class,9), "Level 9");
					}
					if(game.level == 9 ) {
						mainWindow = new Main(new Game(GameLevel10.class,10), "Level 10");
					}
				} catch (InstantiationException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				}
				mainWindow.setVisible(true);
			}
		});


		SoundMaker.getInstance().stopMusic();
		SoundMaker.getInstance().effect(FX.WIN);
	}


}
