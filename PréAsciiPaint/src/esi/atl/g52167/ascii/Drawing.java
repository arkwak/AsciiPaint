/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g52167.ascii;

import java.util.List;

/**
 *
 * @author Laurent
 */
public class Drawing  {
     List<Shape> shapes;
     private int height;
     private int width;

    public Drawing() {
        
    }
     
     

    public Drawing(int length, int width) {
        if(this.height <=0 || this.width <=0 ){
        } else {
            throw new IllegalArgumentException("choose a length and a width");
         }
        this.height = length;
        this.width = width;
        
        
    }

    public int getLength() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    
    public void addShape(Shape shape){
        this.shapes.add(shape);
    }
    public Shape getShapeAt(Point p){
        
        return null;
    }
    
    
     
     
} 
