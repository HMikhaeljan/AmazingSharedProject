/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingsharedproject.Interfaces;

import amazingsharedproject.Player;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import jdk.nashorn.internal.ir.Block;

/**
 *
 * @author Hovsep
 */
public interface IGame extends Remote{

    public Block[][] getGrid() throws RemoteException;

    public List<Player> getPlayers() throws RemoteException;
}
