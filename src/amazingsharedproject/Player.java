/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingsharedproject;

import java.io.Serializable;

/**
 *
 * @author Hovsep
 */
public class Player implements Serializable {
    
    private int ID;
    private int userid;
    private int hitpoints;

    private double X;
    private double Y;
    private boolean isMoving;

    private boolean ready;
    
    private Direction direction = Direction.UP;

    //private Node location;
    //private ImageView imageView;
    
    private int playerRoleID;

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
        this.playerRoleID = roleID;
        this.isMoving = false;
    }
    
    public boolean damage(int damage) {
        if(hitpoints <= 0) 
            return true;
        hitpoints-=damage;
        if(hitpoints <= 0)
            return true;
        else
            return false;
    }
    
    public void setRoleID(int id){
        this.playerRoleID = id;
        
        System.out.println("PlayerRole11111111111111111111111"+id);
    }
    
    public boolean isMoving() {
        return isMoving;
    }
    
    public void setMoving(boolean moving) {
        isMoving = moving;
    }
    public Direction getDirection() {
        return direction;
    }
    
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getPlayerRoleID() {
        System.out.println("PlayerClass Playerrole: " + playerRoleID);
        return playerRoleID;
    }

    public int getUserID() {
        return userid;
    }

    public int getID() {
        return this.ID;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
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
        X = x;
    }

    public void setY(double y) {
        Y = y;
    }

    public int getHitpoints() {
        return hitpoints;
    }
}
