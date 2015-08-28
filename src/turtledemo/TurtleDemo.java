/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package turtledemo;

import apcsturtle.Turtle;
import java.awt.Color;



/**
 *
 * @author DSTIGANT
 */
public class TurtleDemo {

    
    public static void main(String[] args) {
        rectangleDemo();
        // circleDemo();
        // smallSquare();
        // largeSquare();
        // equilateralTriangle();
        // regularPentagon();
        // hypnoEyes();
        // redCross();
        // crescentMoon();
        // star();
        // olympicRings();
        // spiderWeb();
    }
    
    public static void rectangleDemo()
    {
        Turtle shelldon = new Turtle();
        shelldon.forward( 50 );
        shelldon.right( 90 );
        shelldon.forward( 100 );
        shelldon.right( 90 );
        shelldon.forward( 50 );
        shelldon.right( 90 );
        shelldon.forward( 100 );
        shelldon.right( 90 );
    }
    
    public static void circleDemo()
    {
        Turtle shelldon = new Turtle();
        shelldon.setColor( Color.GREEN );
        shelldon.arcRight( 360, 100 );
    }
    
    public static void smallSquare()
    {
        
    }
    
    public static void largeSquare()
    {
        
    }
    
    public static void equilateralTriangle()
    {
        
    }
    
    public static void regularPentagon()
    {
        
    }
    
    public static void hypnoEyes()
    {
        
    }
    
    public static void redCross()
    {
        
    }
    
    public static void crescentMoon()
    {
        
    }
    
    public static void star()
    {
        
    }
    
    public static void olympicRings()
    {
        
    }
    
    public static void spiderWeb()
    {
        
    }
}
