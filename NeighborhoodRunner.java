import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    MuralPainter alex = new MuralPainter();
    WatermelonPainter joe = new WatermelonPainter();
    alex.paintBackground("white",256);
    joe.paintWatermelon();
  }
}