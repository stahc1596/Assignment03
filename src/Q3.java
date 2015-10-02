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
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        //the escape artist name is lightning which will find a exit in the room.
        Robot lightning = new Robot (kw, 1, 1, Direction.SOUTH);
        
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 2, Direction.NORTH);
        new Wall (kw, 1, 3, Direction.NORTH);
        new Wall (kw, 1, 5, Direction.NORTH);
        new Wall (kw, 2, 1, Direction.WEST);
        new Wall (kw, 3, 1, Direction.WEST);
        new Wall (kw, 4, 1, Direction.WEST);
        new Wall (kw, 4, 1, Direction.SOUTH);
        new Wall (kw, 4, 2, Direction.SOUTH);
        new Wall (kw, 4, 3, Direction.SOUTH);
        new Wall (kw, 4, 4, Direction.SOUTH);
        new Wall (kw, 4, 5, Direction.SOUTH);
        new Wall (kw, 4, 5, Direction.EAST);
        new Wall (kw, 3, 5, Direction.EAST);
        new Wall (kw, 2, 5, Direction.EAST);
        new Wall (kw, 1, 5, Direction.EAST);
        
        while (lightning.frontIsClear()){
            lightning.move();
            //lightning moves until she hits a wall.
        }
        while (!lightning.frontIsClear()){
            lightning.turnLeft();
            
            if (lightning.frontIsClear()){
            lightning.move();
            lightning.turnLeft();
            lightning.turnLeft();
            lightning.turnLeft();}
            
            else{}
            //she then checks every wall until she finds the exit.
        
        }if (lightning.frontIsClear()){
            lightning.move();
            //once the exit is found, lightning walks outside.
        }
}
    }

