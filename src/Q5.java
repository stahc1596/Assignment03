/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author stahc1596
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        Robot lightning = new Robot (kw, 1, 1, Direction.EAST);
        
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        
        while (lightning.canPickThing()){
            lightning.pickThing();
            lightning.move();
            lightning.putThing();
            lightning.turnLeft();
            lightning.turnLeft();
            lightning.move();
            lightning.turnLeft();
            lightning.turnLeft();
            //lightning moves all the things until there aren't anymore things.
        }
        lightning.move();
        //lightning notices that there are no more things left and moves back to the
        // rest of the things.
    }
}
