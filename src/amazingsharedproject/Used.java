/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingsharedproject;

import amazingsharedproject.Interfaces.IAbility;
import java.io.Serializable;
import java.rmi.RemoteException;

/**
 *
 * @author Hovsep
 */
public class Used implements IAbility, Serializable{

    int creatorID;
    int abilityID;
    double x;
    double y;
    Direction direction;

    public Used(int creatorID, int abilityID, double x, double y, Direction d) {
        this.creatorID = creatorID;
        this.abilityID = abilityID;
        this.x= x;
        this.y = y;
        this.direction = d;
    }

    public void setX(double x) {
        this.x = x; 
    }
    

    public void setY(double y) {
        this.y = y;
    }
    
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public Double getX() throws RemoteException {
        return x;
    }

    @Override
    public Double getY() throws RemoteException {
        return y;
    }
    
    public Direction getDirection() {
        return direction;
    }

    @Override
    public int getCreatorID() throws RemoteException {
        return creatorID;
    }

    @Override
    public int getAbilityID() throws RemoteException {
        return abilityID;
    }

}
