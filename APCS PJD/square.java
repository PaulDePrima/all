import java.awt.*;
import java.awt.event.*;

public class lab32b
{
		public static void main(String args[])
		{
				GfxApp gfx = new GfxApp();
				gfx.setSize(1000,750);
				gfx.addWindowListener(new WindowAdapter() {public void
				windowClosing(WindowEvent e) {System.exit(0);}});
				gfx.show();
		}
}
class GfxApp extends Frame
{
		public void paint(Graphics g)
		{
				int xCo = (1024/2) - (1024/4)/2;
				int yCo = (768/2) - (768/4)/2;
				int length = 1024/4;
				int width = 768/4;
				g.fillRect(xCo, yCo, length, width);
				Draw(g, xCo, yCo, length, width);
		}
		public void Draw(Graphics g, int maxX, int maxY, int length, int width)
		{
				if(width>=1)
				{
						g.fillRect(maxX, maxY, length, width);
						Draw(g,maxX-length/2, maxY-width/2,length/2,width/2);
						Draw(g,maxX+length, maxY-width/2,length/2,width/2);
						Draw(g,maxX-length/2, maxY+width,length/2,width/2);
						Draw(g,maxX+length, maxY+width,length/2,width/2);
				}
		}
}