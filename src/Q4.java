/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author stahc1596
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        //Our robot lightning will be walking around a 2X2 wall.
        Robot lightning = new Robot (kw, 0, 2, Direction.WEST);
        
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 2, Direction.NORTH);
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 2, 1, Direction.WEST);
        new Wall (kw, 2, 1, Direction.SOUTH);
        new Wall (kw, 2, 2, Direction.SOUTH);
        new Wall (kw, 2, 2, Direction.EAST);
        new Wall (kw, 1, 2, Direction.EAST);
        
        for (int sideCount = 4; sideCount > 0; sideCount = sideCount - 1){
        lightning.move();
        lightning.move();
        lightning.turnLeft();
        lightning.move();
        //lightning will move along the walls 4 times ending at her start position.
    }
    }
}
