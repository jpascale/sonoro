package model.board.level;

import java.awt.*;

/**
 * Created by kevinkraus on 7/10/17.
 */
public class GameLevel6 extends GameLevel{
    @Override
    protected void setContents() {
        addHero(1,0,0);

        addWall(0,1);
        addWall(1,1);
        addWall(2,1);
        addWall(3,1);
        addWall(4,1);
        addWall(5,1);
        addWall(6,1);
        addGoblin(1,7,1);
        addWall(8,1);
        addWall(9,1);
        addWall(10,1);
        addWall(11,1);

        addWall(0,3);
        addGoblin(1,1,3);
        addWall(2,3);
        addWall(3,3);
        addWall(4,3);
        addWall(5,3);
        addWall(6,3);
        addWall(7,3);
        addWall(8,3);
        addWall(9,3);
        addWall(10,3);
        addWall(11,3);

        addWall(0,5);
        addWall(1,5);
        addWall(2,5);
        addWall(3,5);
        addWall(4,5);
        addGoblin(2,5,5);
        addWall(6,5);
        addWall(7,5);
        addWall(8,5);
        addWall(9,5);
        addWall(10,5);
        addWall(11,5);

        addWall(0,7);
        addWall(1,7);
        addWall(2,7);
        addWall(3,7);
        addWall(4,7);
        addWall(5,7);
        addWall(6,7);
        addWall(7,7);
        addWall(8,7);
        addGoblin(4,9,7);
        addWall(10,7);
        addWall(11,7);

        addWall(0,9);
        addWall(1,9);
        addGoblin(5,2,9);
        addWall(3,9);
        addWall(4,9);
        addWall(5,9);
        addWall(6,9);
        addWall(7,9);
        addWall(8,9);
        addWall(9,9);
        addWall(10,9);
        addWall(11,9);

        addGoblin(5,0,11);
        addGoblin(5,2,11);
        addGoblin(9,4,11);
        addGoblin(5,6,11);
        addGoblin(5,8,11);
        addGoblin(5,10,11);


    }

    @Override
    protected Point getHeroInitPosition() {
        return new Point(0, 0);
    }
}
