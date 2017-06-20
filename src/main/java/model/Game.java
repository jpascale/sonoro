package model;

import model.board.Board;
import model.board.Cell;
import model.board.Move;
import model.fighter.Hero;
import sound.SoundMaker;

import java.awt.*;

public class Game {
	
	private Board board;
	
	public <T> Game(Class<T> boardClass) throws InstantiationException, IllegalAccessException {
		this.board = (Board)boardClass.newInstance();
	}
	
	public void onMove(Move move) {
		board.heroMove(move);
		SoundMaker.getInstance().step();
	}
	
	public int getBoardSize() {
		return Board.SIZE;
	}
	
	public Point getHeroPosition() {
		return board.getHeroPosition();
	}
	
	public Cell get(int x, int y) {
		return board.get(x, y);
	}
	
	
	public Hero getHero() {
		return board.getHero();
	}
	
	public boolean isOver() {
		return board.gameOver();
	}
	
	public boolean playerWon() {
		return board.playerWon();
	}
	
}
