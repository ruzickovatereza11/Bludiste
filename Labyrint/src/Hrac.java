import java.awt.Color;

import javax.swing.JPanel;


public class Hrac extends JPanel{
	int x, y;
	
    public Hrac() {
    	this.setBackground(Color.getHSBColor(0.3f, 0.3f, 1));
    	this.setSize(Labyrint.panelSize, Labyrint.panelSize);
    }

    public void moveLeft() {
    	if(x > 0 && Labyrint.map[x-1][y] == 1){
	    	this.setLocation(this.getX()-25, this.getY());
	    	x--;
    	}
    }

    public void moveRight() {
    	if(x < Labyrint.columns-1 && Labyrint.map[x+1][y] == 1){
	    	this.setLocation(this.getX()+25, this.getY());
	    	x++;
    	}
    }

    public void moveUp() {
    	if(y > 0 && Labyrint.map[x][y-1] == 1){
	    	this.setLocation(this.getX(), this.getY()-25);
	    	y--;
    	}
    }

    public void moveDown() {
    	if(y < Labyrint.rows-1 && Labyrint.map[x][y+1] == 1){
	    	this.setLocation(this.getX(), this.getY()+25);
	    	y++;
    	}
    }
}
