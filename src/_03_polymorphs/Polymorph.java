package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
  private  int x;
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
