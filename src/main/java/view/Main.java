package view;

import model.Game;
import model.board.Move;
import sound.FX;
import sound.SoundMaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private Game game;
	private MainPanel mainPanel;
	// private OggClip ogg;
	
	public Main(Game game) {
		super("My Desktop Dungeon");
		
		this.game = game;
		
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setResizable(false);
	    Toolkit toolkit = getToolkit();
	    Dimension size = toolkit.getScreenSize();
	    this.setContentPane(mainPanel = new MainPanel(game));
	    this.setSize(mainPanel.getWidth(), mainPanel.getHeight() + 40);
	    this.setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
	    
	    this.setIconImage(mainPanel.getImageManager().get("ICON"));

		SoundMaker.getInstance().music(FX.MUSIC);
			// ogg = new OggClip(new FileInputStream("resources/map.ogg"));
			// ogg.loop();

	    
	    addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				switch ( e.getKeyCode() ) {
				case KeyEvent.VK_UP:
					Main.this.game.onMove(Move.UP); break;
				case KeyEvent.VK_DOWN:
					Main.this.game.onMove(Move.DOWN); break;
				case KeyEvent.VK_LEFT:
					Main.this.game.onMove(Move.LEFT); break;
				case KeyEvent.VK_RIGHT:
					Main.this.game.onMove(Move.RIGHT); break;
				}
				mainPanel.refresh();
			}
		});
	}

}

