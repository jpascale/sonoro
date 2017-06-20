package model.element;

import model.board.Content;
import model.fighter.Fighter;
import sound.FX;
import sound.SoundMaker;

public class HealthPotion implements Content {

	@Override
	public boolean canWalkOver() {
		return false;
	}

	@Override
	public Content interact(Fighter hero) {
		hero.healFull();
		SoundMaker.getInstance().effect(FX.POWER_UP);
		return null;
	}

}
