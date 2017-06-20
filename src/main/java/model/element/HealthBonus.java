package model.element;

import model.board.Content;
import model.fighter.Fighter;
import sound.FX;
import sound.SoundMaker;

public class HealthBonus extends Bonus implements Content {

	private int value;
	
	public HealthBonus(int value){
		this.value = value;
	}
	
	
	@Override
	public boolean canWalkOver() {
		return false;
	}

	@Override
	public Content interact(Fighter hero) {
		hero.heal(value);
		SoundMaker.getInstance().effect(FX.HEALTH);
		return null;
	}


	@Override
	public int getValue() {
		return value;
	}

}