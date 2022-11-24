/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agata
 */
public class Team {
    
    private String name;    
    private int games;
    private int wins;
    private int losses;
    
    public Team(String name) {
       this.name = name;       
       this.games = 0;
       this.wins = 0;
       this.losses = 0;
    }
    
        
    public void games(){
        this.games++;        
    }
    
    public int getGames(){
        return this.games;
    }   
   
    public void wins(){
        this.wins++;
    }
    
    public int getWins(){
        return this.wins;
    }
    
    public void losses(){
        this.losses++;
    }
    
    public int getLosses(){
        return this.losses;
    }
    
    public String getName(){
        return this.name;
    }
    
    
}
    
   
