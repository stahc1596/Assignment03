/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author stahc1596
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                City kw = new City();
        
        Robot lightning = new Robot (kw, 1, 1, Direction.EAST);
        
        new Wall (kw, 1, 4, Direction.EAST);
        new Thing (kw, 1, 3);
        new Thing (kw, 1, 4);
        
        while (lightning.frontIsClear() && lightning.countThingsInBackpack() == 0){
            lightning.move();
            //lightning moves until she hits a wall or finds a thing.
            
            if (lightning.canPickThing()){
                lightning.pickThing();}
            //lightning will pick up the first thing she sees.
        }
    }
}
