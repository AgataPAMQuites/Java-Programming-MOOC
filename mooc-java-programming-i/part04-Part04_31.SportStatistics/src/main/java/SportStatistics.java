
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        
        ArrayList<Team> team = new ArrayList<>();
        
        
              
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                String game = fileScanner.nextLine();
                String[] parts = game.split(",");
                                
                boolean hasTeam = false;
                                
                for(Team teamObj : team){
                    if(teamObj.getName().equals(parts[0])){
                        hasTeam = true;
                        break;
                    }
                }
                
                if(hasTeam){
                    for(Team teamObj : team){
                        if(teamObj.getName().equals(parts[0])){
                            teamObj.games();
                            if(Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])){
                                teamObj.wins();
                            } else {
                                teamObj.losses();
                            }
                        }
                    }
                } else {
                    Team newTeam = new Team(parts[0]);
                    newTeam.games();                    
                    if(Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])){
                        newTeam.wins();
                    } else {
                        newTeam.losses();
                    }
                    team.add(newTeam);
                }
                
                hasTeam = false;
                
                for(Team teamObj : team){
                    if(teamObj.getName().equals(parts[1])){
                        hasTeam = true;
                        break;
                    }
                }
                
                if(hasTeam){
                    for(Team teamObj : team){
                        if(teamObj.getName().equals(parts[1])){
                            teamObj.games();
                            if(Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])){
                                teamObj.wins();
                            } else {
                                teamObj.losses();
                            }
                        }
                    }
                } else {
                    Team newTeam = new Team(parts[1]);
                    newTeam.games();                    
                    if(Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])){
                        newTeam.wins();
                    } else {
                        newTeam.losses();
                    }
                    team.add(newTeam);
                }
            }
        }
                    
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Team: ");    
        String teamToSearch = scan.nextLine();
        
        boolean hasTeam = false;
        
        for(Team toFind: team){
            if(toFind.getName().equals(teamToSearch)){               
                System.out.println("Games: " + toFind.getGames());
                System.out.println("Wins: " + toFind.getWins());
                System.out.println("Losses: " + toFind.getLosses());
                hasTeam = true;
            }
        }
        
        if (!hasTeam) {
            System.out.println("Games: 0");
            System.out.println("Wins: 0");
            System.out.println("Losses: 0");
        }
    }

}
