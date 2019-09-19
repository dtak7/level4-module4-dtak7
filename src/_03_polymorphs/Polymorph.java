package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	private int width=50;
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
	}
	
   private int x;
  void setX(int i) {
	  this.x=i;
  }
  int getX(){
	 return this.x;
  }
     private int y;
     void setY(int i) {
    	 this.y=i;
     }
     int getY() {
    	 return this.y;
     }
     Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
