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
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        Robot lightning = new Robot (kw, 3, 3, Direction.SOUTH);
        
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 2, Direction.NORTH);
        new Wall (kw, 1, 2, Direction.EAST);
        new Wall (kw, 2, 2, Direction.EAST);
        new Wall (kw, 2, 2, Direction.SOUTH);
        new Wall (kw, 2, 1, Direction.SOUTH);
        new Wall (kw, 2, 1, Direction.WEST);
        new Wall (kw, 1, 1, Direction.WEST);
        
        new Wall (kw, 1, 4, Direction.NORTH);
        new Wall (kw, 1, 5, Direction.NORTH);
        new Wall (kw, 1, 5, Direction.EAST);
        new Wall (kw, 2, 5, Direction.EAST);
        new Wall (kw, 2, 5, Direction.SOUTH);
        new Wall (kw, 2, 4, Direction.SOUTH);
        new Wall (kw, 2, 4, Direction.WEST);
        new Wall (kw, 1, 4, Direction.WEST);
        
        new Wall (kw, 4, 1, Direction.NORTH);
        new Wall (kw, 4, 2, Direction.NORTH);
        new Wall (kw, 4, 2, Direction.EAST);
        new Wall (kw, 5, 2, Direction.EAST);
        new Wall (kw, 5, 2, Direction.SOUTH);
        new Wall (kw, 5, 1, Direction.SOUTH);
        new Wall (kw, 5, 1, Direction.WEST);
        new Wall (kw, 4, 1, Direction.WEST);
        
        new Wall (kw, 4, 4, Direction.NORTH);
        new Wall (kw, 4, 5, Direction.NORTH);
        new Wall (kw, 4, 5, Direction.EAST);
        new Wall (kw, 5, 5, Direction.EAST);
        new Wall (kw, 5, 5, Direction.SOUTH);
        new Wall (kw, 5, 4, Direction.SOUTH);
        new Wall (kw, 5, 4, Direction.WEST);
        new Wall (kw, 4, 4, Direction.WEST);
        
        for (int sidesOfSquare = 4; sidesOfSquare > 0; sidesOfSquare = sidesOfSquare - 1){
            for (int move = 3; move > 0; move = move - 1){
                lightning.move();
            }
            
            if (lightning.getStreet() != 3){
            lightning.turnLeft();}
            
            else if (lightning.getAvenue() != 3){
                lightning.turnLeft();
            }
            
            if (lightning.getAvenue() == 3 && lightning.getStreet() == 3 && lightning.getDirection() != Direction.SOUTH){
                sidesOfSquare = sidesOfSquare + 4;
            }
        }
    }
}
