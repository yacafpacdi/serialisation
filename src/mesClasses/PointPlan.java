package mesClasses;

import java.io.Serializable;

public class PointPlan implements Serializable{
    
    private float x; //latitude
    private float y; //longitude

    public PointPlan() {
    }

    public PointPlan(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + "x=" + x + ", y=" + y + ')';
    }
    
    
    
}
