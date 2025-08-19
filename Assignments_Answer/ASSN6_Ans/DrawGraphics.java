import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Bouncer> bouncers;
    ArrayList<StraightMover> straightMovers;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        bouncers = new ArrayList<>();
        straightMovers = new ArrayList<>();
        bouncers.add(new Bouncer(100, 170, new Rectangle(30, 20, Color.RED)));
        bouncers.add(new Bouncer(50, 70, new Oval(40, 30, Color.BLUE)));
        straightMovers.add(new StraightMover(20, 40, new Rectangle(30, 20, Color.YELLOW)));
        straightMovers.add(new StraightMover(55, 75, new Oval(70, 80, Color.GREEN)));
        bouncers.get(0).setMovementVector(3, 1);
        bouncers.get(1).setMovementVector(2, 2);
        straightMovers.get(0).setMovementVector(1,1);
        straightMovers.get(1).setMovementVector(1,1);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (Bouncer b : bouncers) {
            b.draw(surface);
        }
        for (StraightMover s : straightMovers) {
            s.draw(surface);
        } 
    }
}
