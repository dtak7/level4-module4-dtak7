package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMorph extends Polymorph  {
	

	MouseMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	public void update() {
		
	}
}
