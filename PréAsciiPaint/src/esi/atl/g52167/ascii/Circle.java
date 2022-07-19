/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g52167.ascii;

import java.awt.Point;

/**
 *
 * @author Laurent
 */
public class Circle extends ColoredShape{
     private Point Center;
     private double Radius;

    public Circle(Point Center, double Radius, char Color) {
        this.Center = Center;
        this.Radius = Radius;
    }
     
     
     
    
}
