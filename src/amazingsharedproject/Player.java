/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingsharedproject;

import amazingsharedproject.Interfaces.IPlayer;
import java.io.Serializable;
import java.rmi.RemoteException;
import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.image.ImageView;

/**
 *
 * @author Hovsep
 */
public class Player implements Serializable{

    private int ID;
    private int userid;
    private int hitpoints;
    
    private double X;
    private double Y;
    
    private boolean ready;
    
    //private Node location;
    //private ImageView imageView;
        
    private transient PlayerRole playerRole;
        

	/**
	 * 
	 * @param id
	 * @param hitpoints
	 * @param cooldown
	 */
    public Player(int userid, int id, int hitpoints, int roleID) {
        this.userid = userid;
        this.ID = id;
        this.hitpoints = hitpoints;                
        this.playerRole = new PlayerRole(roleID);
    }
    
    public int getUserID() {    
        return userid;
    }
        
    public int getID()
    {
        return this.ID;
    }
    
    public void setReady(boolean ready) {
        this.ready= ready;
    }
    
    public boolean getReady() {
        return ready;
    }
        
    public Double getX() {
        return X;
    }

    public Double getY() {
        return Y;
    }
    
    public void setX(double x) {
        X= x;
    }
    
    public void setY(double y) {
        Y= y;
    }

    public int getHitpoints() {
        return hitpoints;
    }
}
