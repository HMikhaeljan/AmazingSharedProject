/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingsharedproject.Interfaces;

import amazingsharedproject.GameState;
import amazingsharedproject.Player;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import javafx.scene.input.KeyCode;
import amazingsharedproject.Block;
import java.util.ArrayList;

/**
 *
 * @author Hovsep
 */
public interface IGame extends Remote {

    public int getGameID() throws RemoteException;

    public Block[][] getGrid() throws RemoteException;

    public GameState getGameState() throws RemoteException;

    public void handleInput(int playerid, List<KeyCode> keys) throws RemoteException;

    public void setReady(int playerid, boolean ready) throws RemoteException;

    public Player getPlayer(int userid, String naam) throws RemoteException;

    public String getGameName() throws RemoteException;

    public void setGameName(String g) throws RemoteException;

    public List<Player> getPlayers() throws RemoteException;

    public Boolean allPlayersReady() throws RemoteException;

    public void changeRole(int userid, int playerRoleID) throws RemoteException;
    
    public void addToGameChat(String chat) throws RemoteException;

    public ArrayList<String> loadGameChat() throws RemoteException;

}
