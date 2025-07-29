import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
    BouncingBox box;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawOval(100, 100, 150, 150);
        surface.drawRect(20, 20, 30, 30);
        box.draw(surface);
        surface.drawPolygon(new int[]{50, 100, 75}, new int[]{50, 100, 75}, 3);
    }

} 