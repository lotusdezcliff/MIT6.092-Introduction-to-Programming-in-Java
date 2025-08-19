import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> boxes = new ArrayList<>();
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        BouncingBox box1 = new BouncingBox(200, 50, Color.RED);
        box1.setMovementVector(1, 0);
        BouncingBox box2 = new BouncingBox(100, 50, Color.BLUE);
        box2.setMovementVector(0, 1);
        BouncingBox box3 = new BouncingBox(300, 50, Color.GREEN);
        box3.setMovementVector(1, 1);
        
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawOval(100, 100, 150, 150);
        surface.drawRect(20, 20, 30, 30);
        for (BouncingBox box : boxes) {
            box.draw(surface);}
        surface.drawPolygon(new int[]{50, 100, 75}, new int[]{50, 100, 75}, 3);
    }

} 