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
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        //The robot lightning is going to clean up the litter in the room.
        Robot lightning = new Robot (kw, 1, 1, Direction.EAST);
        
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 2, Direction.NORTH);
        new Wall (kw, 1, 3, Direction.NORTH);
        new Wall (kw, 1, 4, Direction.NORTH);
        new Wall (kw, 1, 5, Direction.NORTH);
        new Wall (kw, 1, 6, Direction.NORTH);
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 2, 1, Direction.WEST);
        new Wall (kw, 3, 1, Direction.WEST);
        new Wall (kw, 3, 1, Direction.SOUTH);
        new Wall (kw, 3, 2, Direction.SOUTH);
        new Wall (kw, 3, 3, Direction.SOUTH);
        new Wall (kw, 3, 4, Direction.SOUTH);
        new Wall (kw, 3, 5, Direction.SOUTH);
        new Wall (kw, 3, 6, Direction.SOUTH);
        new Wall (kw, 1, 6, Direction.EAST);
        new Wall (kw, 2, 6, Direction.EAST);
        new Wall (kw, 3, 6, Direction.EAST);
        
        //Things = litter
        new Thing (kw, 1, 2);
        new Thing (kw, 3, 2);
        new Thing (kw, 3, 3);
        new Thing (kw, 1, 5);
        new Thing (kw, 2, 6);
        new Thing (kw, 2, 2);
        new Thing (kw, 2, 5);
        new Thing (kw, 3, 4);
        
        while (lightning.frontIsClear()){
        
        if (lightning.canPickThing()){
            lightning.pickThing();
            //lightning picks up any litter she walks on.
        }
            
        if (lightning.frontIsClear()){
            lightning.move();}
        //lightning moves to the end of the room
            
        
        if (lightning.getAvenue() == 1){
            lightning.turnLeft();
            
            if (lightning.frontIsClear()){
            lightning.move();
            lightning.turnLeft();}
            //after lightning goes back, she goes south to walk across the room again.
        
            else{
                lightning.turnLeft();
                lightning.turnLeft();
                //if lightning is at can't search the room for litter anymore, lightning
                //goes back to where she started.
                
                while (lightning.getStreet() != 1){
                    lightning.move();
                }
            }}
        else if (!lightning.frontIsClear()){
            lightning.turnLeft();
            lightning.turnLeft();
            //at the end of the room, lightning turns around and goes back
            
            }
    }
        while (lightning.getDirection() != Direction.EAST){
            lightning.turnLeft();
            //lightning job finishes here
        }
}}
