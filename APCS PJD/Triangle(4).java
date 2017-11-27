/**
 * Complete the Applet below which draws the Sierpinski Triangle
 */
import java.awt.*;
import java.applet.*;

public class Triangle extends Applet {
    Graphics g;
    
	/**
	* @param x the x-coordinate of the lower left corner of the triangle to draw
	* @param y the y-coordinate of the top of the triangle to draw
	* @param s the height and width of the triangle to draw
	**/
    public void drawTri(int x, int y, int s) {
	    if (s <= 5) 
		{ 
			return; 
		}
	    else {
	        /**
	         * draw "big" triangle then make recursive
	         * calls to draw three "small" triangles 
	         */
	        
	        int[] a = {x,x+s/2,x+s}; //x coordinates of the corners
	        int[] b = {y+s,y,y+s}; //y coordinates of the corners
	        g.drawPolygon(a,b,3); //draw a polygon with three sides
	        /** 
	         * complete the code to draw the 
	         * three "small" triangles in the 
			 * corners of the triangle we just drew
	         */
			
			
	    }
    }

    public void paint(Graphics gr) {
        g = gr;
        setVisible(true);
        g.setColor(Color.red);
	    drawTri(0, 0, 500);
		
		
	}
}

