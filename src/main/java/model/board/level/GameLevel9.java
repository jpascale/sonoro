package model.board.level;

import java.awt.*;

/**
 * Created by kevinkraus on 7/10/17.
 */
public class GameLevel9 extends GameLevel{
    @Override
    protected void setContents() {
        addHero(1,0,0);

        addGoblin(5,1,1);
        addGoblin(5,3,1);
        addGoblin(9,8,1);

        addGoblin(5,2,11);

        addGoblin(8,0,3);
        addGoblin(5,2,3);
        addGoblin(4,4,3);
        addGoblin(5,6,3);
        addGoblin(4,8,3);
        addGoblin(5,10,3);

        addGoblin(5,2,5);
        addGoblin(2,5,5);
        addGoblin(2,7,5);
        addGoblin(5,10,5);

        addGoblin(10,1,7);
        addGoblin(5,6,7);
        addGoblin(3,9,7);

        addGoblin(5,3,8);

        addGoblin(3,1,9);
        addGoblin(5,5,9);

        addGoblin(1,7,10);
        addGoblin(1,10,10);

    }

    @Override
    protected Point getHeroInitPosition() {
        return new Point(0, 0);
    }
}
