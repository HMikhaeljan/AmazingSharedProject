/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingsharedproject;

import amazingsharedproject.Player;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Hovsep
 */
public class GameState implements Serializable{
    List<Player> players;
    List<Used> abilities;
    List<String> messages;
    
    
    
    public GameState(List<Player> players, List<Used> abilities, List<String> messages ){
        this.players = players;
        this.abilities = abilities;
        this.messages = messages;
    }
    
    public List<Player> getPlayers() {
        return players;
    }
    
    public List<Used> getAbilities() {
        return abilities;
    }
    
    public List<String> getMessages() {
        return messages;
    }
}
