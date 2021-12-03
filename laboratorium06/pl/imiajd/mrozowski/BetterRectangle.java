package pl.edu.uwm.wmii.marcelmrozowski.laboratorium06.pl.imiajd.mrozowski;
import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int height, int width, int x, int y){
        super(x, y, width, height);
    }

    public int getPerimeter(){
        return 2*this.width + 2*this.height;
    }

    public int GetArea(){
        return this.width*this.height;
    }
}
