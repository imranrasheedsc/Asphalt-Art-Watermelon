import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    MuralPainter alex = new MuralPainter();
    WatermelonPainter joe = new WatermelonPainter();
    // Paints the background and adds 256 paint to the painters bucket because it is in a 16x16 grid format.
    alex.paintBackground("white",256);
    // Runs the paint watermelon function, painting the entire watermelon.
    joe.paintWatermelon();
  }
}
