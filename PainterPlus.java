import org.code.neighborhood.*;
    
public class PainterPlus extends Painter {

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
