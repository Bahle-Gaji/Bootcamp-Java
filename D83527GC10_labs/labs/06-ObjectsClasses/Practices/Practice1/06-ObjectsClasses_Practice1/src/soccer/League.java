/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer;

/**
 *
 * @author bahle
 */
public class League {
    public static void main(String[] args){
        Player player1 = new Player();
        player1.playerName = "George Elliot";
        
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        
        Player player3 = new Player();
        player3.playerName = "Geoffrty Chaucer";
        
        Player[] thePlayers = {player1, player2, player3};
        
        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;
    }
    
}
