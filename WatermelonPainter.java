import org.code.neighborhood.*;

public class WatermelonPainter extends MuralPainter {
  public void moveSpaces(int length) {
    for (int i = 0; i < length; i++) {
      move();
    }
  }


  public void paintThenMove(String color, int length, String type) {
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

  public void paintDiagonalSegment(String color, String direction){
    paint(color);
    if(canMove()){
      move();
      if (direction == "up") {
        turnRight(); 
      } else {
        turnLeft();
      }
     	
      if(canMove()){
      	move();
        paint(color);
        if (direction == "up") {
          turnLeft(); 
        } else {
          turnRight();
        }
       }
    
    }
  }
  
  public void paintWatermelon() {
    paintShell(47);
    paintWhite(23);
    paintMelon(50);
    turnRight();
    resetPosition();
  }

  public void paintShell(int paintRequired) {
    setPaint(paintRequired);
    moveFast();
    turnRight();
    move();
    turnRight();
    moveFast();
    turnLeft();
    move();
    turnLeft();
    moveSpaces(10);
    paintThenMove("green",1,"a");
    paint("darkgreen");
    turnRight();
    move();
    paint("green");
    turnLeft();
    move();
    paint("darkgreen");
    turnRight();
    move();
    paint("green");
    turnLeft();
    move();
    paint("darkgreen");
    turnRight();
    paintThenMove("darkgreen",5,"a");
    turnRight();
    move();
    turnRight();
    move();
    paintThenMove("green",5,"a");
    turnAround();
    moveSpaces(5);
    paintThenMove("darkgreen",2,"b");
    turnRight();
    move();
    paint("darkgreen");
    turnLeft();
    move();
    paint("darkgreen");
    turnRight();
    move();
    paint("darkgreen");
    turnLeft();
    move();
    paint("darkgreen");
    turnRight();
    move();
    paint("darkgreen");
    turnLeft();
    move();
    turnRight();
    paintThenMove("darkgreen",6,"b");
    paintDiagonalSegment("darkgreen","up");
    paintDiagonalSegment("darkgreen","up");
    turnRight();
    move();
    paint("darkgreen");
    turnRight();
    move();
    turnRight();
    move();
    paintDiagonalSegment("green","down");
    turnLeft();
    paintThenMove("green",5,"b");
    turnLeft();
    paintDiagonalSegment("green","up");
    paintDiagonalSegment("green","up");
    paintDiagonalSegment("green","up");
  }

  public void paintWhite(int paintRequired) {
    setPaint(paintRequired);
    moveSpaces(6);
    turnLeft();
    move();
    turnLeft();
    paintDiagonalSegment("white","down");
    paintThenMove("white",4,"b");
    turnRight();
    move();
    turnLeft();
    move();
    turnRight();
    paintDiagonalSegment("white","down");
    paintDiagonalSegment("white","down");
    paintThenMove("white",4,"b");
    move();
    paintDiagonalSegment("white", "up");
    turnAround();
    move();
    paint("white");
    moveSpaces(5);
    turnLeft();
    paintDiagonalSegment("white", "up");
    paintDiagonalSegment("white", "up");
    moveSpaces(4);
    paint("white");
    move();
    turnLeft();
    move();
  }
  
  public void paintMelon(int paintRequired) {
    setPaint(paintRequired);
    paintDiagonalSegment("red","down");
    paintDiagonalSegment("red","down");
    paintDiagonalSegment("red","down");
    paintDiagonalSegment("red","down");
    paintDiagonalSegment("red","down");
    paintDiagonalSegment("red","down");
    move();
    turnAround();
    move();
    move();
    turnRight();
    paint("black");
    move();
    turnLeft();
    paintThenMove("red",4,"a");
    turnLeft();
    move();
    paintDiagonalSegment("red","up");
    paintDiagonalSegment("red","up");
    paintThenMove("red",2,"b");
    turnLeft();
    move();
    paint("black");
    turnRight();
    move();
    paint("red");
    turnAround();
    move();
    paintThenMove("red",2,"b");
    turnRight();
    move();
    turnLeft();
    move();
    turnRight();
    paintDiagonalSegment("red","down");
    paintThenMove("red",2,"b");
    turnRight();
    move();
    paint("red");
    turnRight();
    move();
    paint("black");
    move();
    turnLeft();
    paintDiagonalSegment("red","up");
    paint("black");
    paintThenMove("red",2,"b");
    turnLeft();
    move();
    turnLeft();
    paintThenMove("red",2,"b");
    turnRight();
    move();
    paint("red");
    moveSpaces(3);
    turnLeft();
    move();
    turnAround();
  }
}