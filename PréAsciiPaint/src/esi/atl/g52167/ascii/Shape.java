package esi.atl.g52167.ascii;

import java.awt.Point;

/**
 *Interface shape
 * @author Laurent
 */
public interface Shape {

    /**
     *permit to move the shape
     * @param dx the x axe
     * @param dy the y axe
     */
    void move(double dx, double dy);
    
    /**
     *check if the point is inside the shape
     * @param p the point
     * @return True if the point is inside the shape, False if it is not
     */
    boolean isInside(Point p);
    
    /**
     *show permit to get the color
     * @return the first caracter of the color
     */
    char getColor();
    
}
