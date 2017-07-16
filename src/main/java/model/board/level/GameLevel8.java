package model.board.level;

import java.awt.*;

/**
 * Created by kevinkraus on 7/10/17.
 */
public class GameLevel8 extends GameLevel{
    @Override
    protected void setContents() {
        addHero(1,0,0);
        addWall(0,1);
        addWall(1,1);
        addWall(2,1);
        addGoblin(1,3,1);
        addWall(4,1);
        addWall(5,1);
        addWall(6,1);
        addGoblin(1,7,1);
        addWall(8,1);
        addWall(9,1);
        addWall(10,1);


        addWall(1,1);
        addWall(1,2);
        addWall(1,3);
        addWall(1,4);
        addWall(1,5);
        addWall(1,6);
        addWall(1,7);
        addWall(1,8);
        addWall(1,9);
        addWall(1,10);

        addWall(10,1);
        addWall(10,2);
        addWall(10,3);
        addWall(10,4);
        addWall(10,5);
        addWall(10,6);
        addWall(10,7);
        addWall(10,8);
        addWall(10,9);
        addWall(10,10);


        addWall(7,3);
        addWall(7,4);
        addWall(7,5);
        addWall(7,6);
        addWall(7,7);
        addWall(7,8);
        addWall(7,9);
        addWall(7,10);
        addWall(7,11);


        addWall(5,3);
        addWall(5,4);
        addWall(5,5);
        addWall(5,6);
        addWall(5,7);
        addWall(5,8);
        addWall(5,9);
        addWall(5,10);

        addWall(3,3);
        addWall(3,4);
        addWall(3,5);
        addWall(3,6);
        addWall(3,7);
        addWall(3,8);


        addWall(4,3);

        addWall(2,10);
        addWall(3,10);
        addWall(4,10);

        addWall(8,4);
        addWall(9,4);

        addGoblin(1,0,5);

        addGoblin(1,11,1);
        addGoblin(3,11,5);
        addGoblin(1,11,9);

        addGoblin(1,8,3);
        addGoblin(6,9,3);


        addGoblin(1,8,5);
        addGoblin(3,9,5);

        addGoblin(1,8,8);
        addGoblin(5,9,8);

        addGoblin(2,6,2);
        addGoblin(3,6,5);
        addGoblin(8,6,9);

        addGoblin(5,2,2);
        addGoblin(2,2,5);
        addGoblin(4,2,9);

        addGoblin(4,4,4);
        addGoblin(8,4,7);
        addGoblin(6,4,9);

        addShield(2, 0, 1);
        addSword(5, 0, 2);
        addShield(3, 1, 0);
        addSword(5, 2, 0);
    }

    @Override
    protected Point getHeroInitPosition() {
        return new Point(0, 0);
    }
}

