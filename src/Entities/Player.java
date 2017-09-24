package Entities;

import java.awt.*;
import java.util.Observable;
/**
 * Created by Shlomoburg on 19/09/2017.
 */
public class Player extends Observable implements Entity {
    private Direction dir;
    private Image sprite; //the visual representation of the unit
    private int health; // how much health the unit has
    private int damage; // how much damage the unit deals
    private int speed; // how fast the unit can move


    public int getHealth(){return health;}
    public int getDamage(){return damage;}
    public int getSpeed(){return speed;}
    public Image getSprite(){return sprite;}

    public boolean isDead(){
        if (health<=0){
            return true;
        }
        return false;
    }
    public void attack(Entity entity){
        entity.damaged(this.damage);
    }
    public void damaged(int damageAmount){
        this.health = this.health - damageAmount;
    }
    public boolean inAggroRange(){return false;}

    @Override
    public boolean canMove() {
        return true;
    }

    public String toString() {
        return "+";
    }
}