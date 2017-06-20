package model.element;

import model.board.Content;
import model.fighter.Fighter;
import model.fighter.FighterHero;
import model.fighter.ShieldHero;
import sound.FX;
import sound.SoundMaker;

public class Shield extends Bonus implements Content{

private int value;
	
	public Shield(int value){
		this.value = value;
	}
	
	@Override
	public int getValue() {
		return value;
	}

	@Override
	public boolean canWalkOver() {
		return true;
	}
	
	@Override
	public Content interact(Fighter hero) {
		FighterHero fg = (FighterHero) hero;
		SoundMaker.getInstance().effect(FX.USE_SWORD);
		return new ShieldHero(fg, this);
	}

}
