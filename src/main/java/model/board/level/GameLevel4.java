package model.board.level;

import java.awt.*;

/**
 * Created by kevinkraus on 7/10/17.
 */
public class GameLevel4 extends GameLevel{
    @Override
    protected void setContents() {
        addHero(1,0,0);

        addWall(1,1);
        addWall(2,1);
        addWall(3,1);
        addWall(4,1);
        addWall(5,1);
        addWall(6,1);
        addWall(7,1);
        addWall(8,1);

        addWall(0,4);
        addWall(1,4);
        addWall(2,4);
        addWall(3,4);
        addWall(4,4);

        addWall(5,5);
        addWall(6,5);
        addWall(7,5);
        addWall(8,5);

        addWall(5,10);
        addWall(6,10);
        addWall(7,10);
        addWall(8,10);

        addWall(4,1);
        addWall(4,2);
        addWall(4,3);
        addWall(4,4);
        addWall(4,5);
        addWall(4,6);
        addWall(4,7);
        addWall(4,8);
        addWall(4,9);
        addWall(4,10);


        addGoblin(1,9,0);

        addGoblin(1,9,5);
        addGoblin(1,10,5);
        addGoblin(1,11,5);

        addGoblin(1,1,6);
        addGoblin(1,2,6);
        addGoblin(1,3,6);
    }

    @Override
    protected Point getHeroInitPosition() {
        return new Point(0, 0);
    }
}
