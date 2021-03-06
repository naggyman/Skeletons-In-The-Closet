package Entities;

/**
 * Created by Shlomoburg on 19/09/2017.
 */
public class Wall implements Entity, java.io.Serializable {

    private int level;

    @Override
    public void setDirection(Direction dir) {

    }

    @Override
    public int getHealth() {
        return -1;
    }

    @Override
    public int getMaxHealth() {
        return -1;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getDamage() {
        return -1;
    }

    public Wall(int level){
        this.level = level;
    }
    public boolean inAggroRange(){throw new Error();}
    public boolean isDead(){return false;}

    public String getImageName(){
        return "Wall" + this.level;
    }

    @Override
    public void attack(Entity entity, boolean aoe) {/*throw new Error();*/}

    @Override
    public void damaged(int damage) {/*throw new Error();*/}

    public boolean canMove() {
        return false;
    }

    public boolean canStepOn() {
        return false;
    }

    public String toString() {
        return "*";
    }


    public boolean ping(){return false;}}
