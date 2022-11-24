/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agata
 */
public class Fitbyte {
    
    private int age;
    private int rhr;
    
    public Fitbyte(int age, int rhr){
        this.age = age;
        this.rhr = rhr;       
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double max =  206.3 - (0.711 * age);
        return ((max - rhr) * (percentageOfMaximum) + rhr);
    }
    
}
