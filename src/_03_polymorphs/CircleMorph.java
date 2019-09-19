package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{
	int i=0;
	CircleMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}
	public void update() {
	setX((int)(getX()+Math.cos(i)*100));
	setY((int)(getY()+Math.sin(i)*100));
			i++;
	}

}
