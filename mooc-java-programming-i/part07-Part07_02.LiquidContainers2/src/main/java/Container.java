/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agata
 */
public class Container {
    
    private int liquid;
    private int limit;
    
    public Container(){
        this.liquid = 0;
        this.limit = 100;        
    }
    
    public int contains(){
        return this.liquid;
    }
    
    public void add(int amount){
        if(amount > 0){                     
            liquid += amount;
            if(liquid > limit){
            liquid = limit;
            }
        }
    }
    
    public void remove(int amount){
        liquid -= amount;
        if(liquid < 0){
            liquid = 0;
        }
    }
    
    public String toString(){
        return liquid + "/" + limit;
    }
}
