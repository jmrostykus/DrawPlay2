import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 100;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 10;
	private static final int EYE_WIDTH = 20;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/4;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX;
		int y=catY;
		// Draw the ears
		g2.setColor(Color.orange);
		g2.fillOval(x + HEAD_DIMENSION*5/8, y, HEAD_DIMENSION/8, HEAD_DIMENSION/2);
		g2.fillOval(x + HEAD_DIMENSION/4, y, HEAD_DIMENSION/8, HEAD_DIMENSION/2);
		// Draw the head
		g2.setColor(Color.blue);
		g2.fillOval(x, y, HEAD_DIMENSION, 4*HEAD_DIMENSION);
		// Draw the eyes
		g2.setColor(Color.green);
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.pink);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		g2.setColor(Color.black);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("Bruh", catX, catY+HEAD_DIMENSION+10);	
		//Draw the nose
		g2.setColor(Color.red);
		g2.fillOval(catX+MOUTH_X+5, catY+MOUTH_Y-15, MOUTH_WIDTH/2, MOUTH_HEIGHT/2);
		//Draw Hat
		g2.setColor(Color.black);
		g2.fillOval(catX, catY-40, HEAD_DIMENSION, HEAD_DIMENSION/2);
		g2.fillOval(catX+25, catY-70, HEAD_DIMENSION/2, HEAD_DIMENSION*3/4);
	}
}
