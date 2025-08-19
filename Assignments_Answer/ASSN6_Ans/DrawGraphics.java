import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Mover> movers;

    public DrawGraphics() {
        movers = new ArrayList<>();
        
        movers.add(new Bouncer(100, 170, new Rectangle(15, 20, Color.RED)));
        movers.get(0).setMovementVector(3, 1);
        movers.add(new Bouncer(50, 70, new Oval(30, 20, Color.BLUE)));
        movers.get(1).setMovementVector(2, 2);
        
        movers.add(new StraightMover(20, 40, new Rectangle(15, 20, Color.YELLOW)));
        movers.get(2).setMovementVector(1, 1);
        movers.add(new StraightMover(55, 75, new Oval(30, 20, Color.GREEN)));
        movers.get(3).setMovementVector(1, 1);
    }

    public void draw(Graphics surface) {
        for (Mover m : movers) {
            m.draw(surface);
        }
    }
}