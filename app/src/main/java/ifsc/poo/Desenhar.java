package ifsc.poo;
import edu.princeton.cs.algs4.Draw;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class Desenhar {
    private Draw draw;
    private Color[] cores = {
        Color.BLACK,
        Color.BLUE,
        Color.GREEN,
        Color.ORANGE
    };

    public Desenhar() {
        draw = new Draw();
        draw.setCanvasSize(800, 600);
        draw.setXscale(-400, 400);
        draw.setYscale(-300, 300);
    }

    public Draw getDraw() {
        return draw;
    }
}