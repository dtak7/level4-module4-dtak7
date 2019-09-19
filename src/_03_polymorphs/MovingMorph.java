package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph {

	MovingMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	public void update() {
		Random rand = new Random(); 
		int value = rand.nextInt(5);
		if(value==0) {
		setX(getX()+3);
		}
		else if(value==1) {
			setX(getX()-3);
		}
		else if(value==2) {
			setY(getY()+3);
		}
		else if(value==3) {
			setY(getY()-3);
		}
	}

}
