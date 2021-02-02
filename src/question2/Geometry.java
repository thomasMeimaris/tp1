package question2;

import java.awt.*;
import java.util.Objects;

public class Geometry {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Type:" + this.type;
    }

    @Override
    public boolean equals(Object o) {
        if( this.getClass() != o.getClass()){
            return false;
        }
        Geometry g = (Geometry) o;
        return this.type.equals(g.type);
    }

    public static int surface(int lenth, int width) {
        return lenth * width;
    }
    public static int perimeter(int a){
        return a * 4;
    }
}
