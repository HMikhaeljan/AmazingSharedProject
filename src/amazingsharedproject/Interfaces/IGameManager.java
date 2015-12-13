/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingsharedproject.Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Hovsep
 */
public interface IGameManager extends Remote {

    public IGame newLobby(int userid) throws RemoteException;

    public IGame joinLobby(int gameid, int userid) throws RemoteException;

    public ArrayList<IGame> getGames() throws RemoteException;

}
