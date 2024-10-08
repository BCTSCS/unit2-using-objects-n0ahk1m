import greenfoot.*;

public class Rectangle extends Actor {
  private int width;
  private int height;
  
  public Rectangle(int w, int h){
    width = w;
    height = h;
    getImage().scale(width*10, height*10);
  }
  
  public Rectangle(int s){
    width = s;
    height = s;
    getImage().scale(width*10, height*10);
  }
  
  public Rectangle(){
    width = 10;
    height = 10;
    getImage().scale(width*10, height*10);
  }
  
  public static void main(String[] args){
    Rectangle rect1 = null;
    System.out.println(rect1);
    rect1 = new Rectangle(12,10);
    System.out.println(rect1);
  }
  
  public String toString(){
      return "Rectangle " + System.identityHashCode(this) + " Width " + width + " Height " + height;
  }
}