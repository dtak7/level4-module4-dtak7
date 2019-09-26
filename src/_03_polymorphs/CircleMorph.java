package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {
	int i = 0;

	CircleMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect(getX(), getY(), getWidth(), getHeight());

	}

	public void update() {
		if (getY() == 0 || getX() == 0) {
			setY(200);
			setX(200);
		} else {
			setX((int) (getX() + Math.cos(i) * 50));
			setY((int) (getY() + Math.sin(i) * 50));
			i++;
		}
	}
}
