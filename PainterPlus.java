import org.code.neighborhood.*;
    
public class PainterPlus extends Painter {

    // runs a for loop to run the move() function length amount of times while the painter is able to move

    public void moveSpaces(int length) {
      // for loop
      for (int i = 0; i < length; i++) {
        if (canMove()) {
          move();
        }
      }
    }

    // Moves and paints a color that is passed to the function, runs the for loop for length amount of times
    // If the type specified is "a", it will make the painter paint first and then move, but if the type specified is "b" it will 
    // make the painter move and then paint.

    public void paintMove(String color, int length, String type) {
      // for loop.
      for (int i = 0; i < length; i++) {
        if (type == "a") {
          paint(color);
          move();
        } else if (type == "b") {
          move();
          paint(color);
        }
      }
    }

    public void turnRight() {
      turnLeft();
      turnLeft();
      turnLeft();
    }

    public void takeAllPaint() {
      while (isOnBucket()) {
        takePaint();
      }
    }

    public void moveFast() {
      while (canMove()) {
        move();
      }
    }

    public void paintToEmpty(String color) {
      while (hasPaint()) {
        paint(color);
        move();
      }
    }
}