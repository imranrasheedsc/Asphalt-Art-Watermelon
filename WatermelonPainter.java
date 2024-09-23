import org.code.neighborhood.*;

public class WatermelonPainter extends MuralPainter {

  // runs a for loop to run the move() function length amount of times while the painter is able to move
  public void moveSpaces(int length) {
      // for loop
    for (int i = 0; i < length; i++) {
      if (canMove()) {
         move();
       }
    }
  }
  
  /*
   * Not my method, I modified the code to include the direction parameter 
   * which changes the direction based on the argument passed. 
   * Ex. "up" turns the player Right first and then left, "down" turns the player left and then right.
  */

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
  
  // Main function that initalizes all the functions and puts them in the correct order

  public void paintWatermelon() {
    // Arguments here specify the amount of paint required to paint that certain part of the watermelon 
    paintShell(47);
    paintWhite(23);
    paintMelon(50);
    turnRight();
    resetPosition();
  }

  // Paints the green & darkgreen parts of the watermelon shell.

  public void paintShell(int paintRequired) {
    setPaint(paintRequired); // adds the amount of paint passed to the painters bucket
    moveFast();
    turnRight();
    move();
    turnRight();
    moveFast();
    turnLeft();
    move();
    turnLeft();
    moveSpaces(10);
    paintMove("green",1,"a");
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
    paintMove("darkgreen",5,"a");
    turnRight();
    move();
    turnRight();
    move();
    paintMove("green",5,"a");
    turnAround();
    moveSpaces(5);
    paintMove("darkgreen",2,"b");
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
    paintMove("darkgreen",6,"b");
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
    paintMove("green",5,"b");
    turnLeft();
    paintDiagonalSegment("green","up");
    paintDiagonalSegment("green","up");
    paintDiagonalSegment("green","up");
  }

  // Paints the white part of the watermelon shell.

  public void paintWhite(int paintRequired) {
    setPaint(paintRequired); // adds the amount of paint passed to the painters bucket
    moveSpaces(6);
    turnLeft();
    move();
    turnLeft();
    paintDiagonalSegment("white","down");
    paintMove("white",4,"b");
    turnRight();
    move();
    turnLeft();
    move();
    turnRight();
    paintDiagonalSegment("white","down");
    paintDiagonalSegment("white","down");
    paintMove("white",4,"b");
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
  
  // Paints the melon part of the watermelon, which is predominately red.

  public void paintMelon(int paintRequired) {
    setPaint(paintRequired); // adds the amount of paint passed to the painters bucket

    // Paints diagonal segments with the color red downwards
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
    paintMove("red",4,"a");
    turnLeft();
    move();
    paintDiagonalSegment("red","up");
    paintDiagonalSegment("red","up");
    paintMove("red",2,"b");
    turnLeft();
    move();
    paint("black");
    turnRight();
    move();
    paint("red");
    turnAround();
    move();
    paintMove("red",2,"b");
    turnRight();
    move();
    turnLeft();
    move();
    turnRight();
    paintDiagonalSegment("red","down");
    paintMove("red",2,"b");
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
    paintMove("red",2,"b");
    turnLeft();
    move();
    turnLeft();
    paintMove("red",2,"b");
    turnRight();
    move();
    paint("red");
    moveSpaces(3);
    turnLeft();
    move();
    turnAround();
  }
}
