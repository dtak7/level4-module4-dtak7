package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{
/*	private int width=50;
	void setWidth(int i) {
		this.width=i;
	}
	int getWidth() {
		return this.width;
	}
	private int height = 50;
	void setHeight(int i) {
		this.height=i;
	}
	int getHeight() {
		return this.height;
	}*/
	BluePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, 50, 50);
	}
	
}
