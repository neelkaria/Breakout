package Elements;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class brick 
{
	public int x;
	public int y;
	public int w=140;
	public int h=55;
	boolean state;
	public brick(int x, int y)
	{

		this.x = x;
		this.y = y;
		state = true;
	}
	
	public void draw(Graphics g)//, Color colour )
	{
		
		if (state)
		{
		g.setColor(new Color(150,150,255));
		g.fillRect(this.x, this.y, w, h);
		}
	}
}
