/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingsharedproject.Interfaces;

import amazingsharedproject.User;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Hovsep
 */
public interface ILogin extends Remote {

    public List<User> getAllUsers() throws RemoteException;

    public List<User> getOnlineUsers() throws RemoteException;

    public void addToOnline(User user) throws RemoteException;

    public void removeFromOnline(User user) throws RemoteException;

    public User Login(String username, String password) throws RemoteException;

    public void registerUser(String username, String password) throws RemoteException;
}
