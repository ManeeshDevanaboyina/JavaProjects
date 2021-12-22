/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S545394
 */
public class Rectangle {
    
    
    private int length;
    private int width;
    
    //Constructor
    
    public Rectangle(int len,int wid){
        length=len;
        width=wid;
    }
    
    //setter

    public void setLength(int len) {
        this.length = len;
    }

    public void setWidth(int wid) {
        this.width = wid;
    }
    
    //getter

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    
    
    
    
}
