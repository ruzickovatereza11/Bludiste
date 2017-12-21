
import javax.swing.JPanel;

public class Dlazdice extends JPanel{
    int x, y;
    boolean isWall = true;
    
    public Dlazdice(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void setWall(boolean isWall){
        this.isWall = isWall;
    }
}
