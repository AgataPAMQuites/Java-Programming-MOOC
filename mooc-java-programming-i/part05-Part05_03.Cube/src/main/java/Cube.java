/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agata
 */
public class Cube {
    
    private int lenght;
    
    public Cube(int edgeLenght){
        this.lenght = edgeLenght;
    }
    
    public int volume(){
        return lenght * lenght * lenght;
    }
    
    public String toString(){
        return "The lenght of the edge is " + lenght + "and the volume " + volume();
    }
    
}
