import processing.core.PApplet;

public class Sketch extends PApplet {
	/**
  * Description: A program that draws a house with clouds,   
  * windows and trees.
  * Author: Brady So
  */
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1000, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial setup
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(51, 153, 255);
  }
  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
   
    // Drawing clouds as background (circles)
    fill(255, 255, 255);
    ellipse(35, 25, 200, 50);
    ellipse(175, 25, 200, 50);
    ellipse(350, 25, 200, 50);
    ellipse(490, 25, 200, 50);

    // Drawing the house (square)
    fill(153, 0, 0);
    rect(170, 135, 220, 200);

    // Drawing the door (rectangle)
    fill(153, 102, 0);
    rect(252, 230, 50, 70);

    // Drawing windows (squares)
    fill(204, 204, 204);
    rect(320, 157, 40, 40);
    rect(195, 157, 40, 40);
    rect(195, 230, 30, 30);
    rect(325, 230, 30, 30);
    
    // Drawing grass (foreground)
    fill(0, 204, 0); 
    rect(0, 280, 600, 500);

    // Drawing the roof (triangle)
    fill(102, 51, 0);
    triangle(272, 45, 407, 145, 157, 145);

    // Drawing the trees (Circles & rectangles)
    fill(51, 0 ,0);
    rect(25, 100, 50, 180);
    fill(0, 153, 0);
    ellipse(50, 100, 90, 50);
    fill(51, 0 ,0);
    rect(485, 100, 50, 180);
    fill(0, 153, 0);
    ellipse(510, 100, 90, 50);
  
 }
}