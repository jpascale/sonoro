package model.board.level;

import java.awt.*;

/**
 * Created by kevinkraus on 7/10/17.
 */
public class GameLevel10 extends GameLevel{
    @Override
    protected void setContents() {
        addHero(1,0,0);
        addWall(0,3);

        addWall(1,1);
        addWall(2,1);
        addWall(3,1);
        addWall(4,1);
        addWall(5,1);
        addWall(6,1);
        addWall(7,1);
        addWall(8,1);
        addWall(0,1);

        addWall(1,6);
        addWall(2,6);
        addWall(3,6);
        addWall(4,6);
        addWall(5,6);

        addWall(5,10);
        addWall(6,10);
        addWall(7,10);
        addWall(8,10);
        addWall(9,10);
        addWall(10,10);

        addWall(1,8);
        addWall(2,8);
        addWall(3,8);

        addGoblin(1,9,0);
        addGoblin(1,10,5);
        addGoblin(1,7,4);
        addGoblin(1,6,5);
        addGoblin(1,5,11);


        addGoblin(1,2,2);
        addGoblin(1,2,4);

    }

    @Override
    protected Point getHeroInitPosition() {
        return new Point(0, 0);
    }
}
