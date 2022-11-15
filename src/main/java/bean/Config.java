/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author SMART
 */
public class Config implements Serializable{
    private static Config config = null;
    private Player[] players = new Player[0];
    private static boolean loggedIn;

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }
    
     public void appendPlayer(Player s){
        Player[] newPlayers = new Player[players.length + 1];
        
        for(int i = 0;i < players.length;i++){
            newPlayers[i] = players[i];
        }
        
        newPlayers[newPlayers.length - 1] = s;
        
        players = newPlayers;
    }
    
    public static Config instance(){
        if(config == null){
            config = new Config();
        }
        
        return config;
    }

    
    
}
