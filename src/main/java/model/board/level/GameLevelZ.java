package model.board.level;

import java.awt.Point;

public class GameLevelZ extends GameLevel {

	@Override
	protected void setContents() {

		// Cargo el héroe.
		addHero(1,0,0);
				
		// add walls
		addWall(1,1);
		addWall(1,2);
		addWall(2,2);
		addWall(3,2);
		addWall(3,3);
		addWall(3,4);
				
		addWall(1,4);
		addWall(1,5);
		addWall(1,6);
		addWall(2,6);
		addWall(3,6);
		addWall(3,7);
		addWall(3,8);
		addWall(3,9);
				
				
		for(int i = 2; i <= 10; i++){
			addWall(i,10);
		}
			
		
		addWall(5,2);
		addWall(5,3);
		addWall(5,4);
		addWall(5,5);
		addWall(5,6);
		addWall(5,7);
		addWall(5,8);
		addWall(6,2);
		addWall(6,3);
		addWall(6,4);
		addWall(6,8);
		addWall(7,8);
		addWall(8,8);
				
		addWall(8,1);
		addWall(8,2);
		addWall(8,3);
		addWall(9,2);
		addWall(9,3);
		addWall(10,2);
		addWall(10,3);
		addWall(10,4);
		addWall(10,5);
		addWall(10,6);
		addWall(10,7);
		addWall(10,8);
				
				
		// add enemies.
		addGoblin(1, 2, 1);
		addGoblin(2, 5, 0);
		addGoblin(3, 5, 1);
		addGoblin(2, 9, 0);
		addGoblin(3, 0, 6);
		addGoblin(1, 1, 8);
		addGoblin(6, 1, 10);
		addGoblin(1, 4, 3);
		addGoblin(1, 6, 7);
		addGoblin(2, 7, 6);
		addGoblin(2, 8, 5);
		addGoblin(1, 9, 4);
		addGoblin(3, 11,5);
		addGoblin(1, 1, 3);
		
		addSerpent(1, 11, 2);
		addSerpent(2, 7, 9);
		addSerpent(2, 4, 9);
		addSerpent(5, 2, 11);
				
		addGolem(3, 7, 3);
		addGolem(4, 11, 8);
		addGolem(5, 4, 7);
		addGolem(6, 0, 10);
				
				
		// add bonuses.
		addAttackBonus(3, 2, 3);
		addAttackBonus(3, 0, 11);
		addAttackBonus(3, 11, 11);
		
				
		addHealthPotion(11, 0);
		addHealthPotion(9, 7);
		addHealthPotion(11, 6);
				
				
		addHealthBonus(2, 3, 1);
		addHealthBonus(2, 3, 5);
		addHealthBonus(4, 6, 5);
		
		addShield(2, 2, 4);
	}

	@Override
	protected Point getHeroInitPosition() {
		return new Point(0, 0);
	}

}
