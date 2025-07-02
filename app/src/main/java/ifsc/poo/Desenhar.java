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

    public void desenharForma(Forma forma) {
        draw.setPenColor(cores[forma.getIndiceCor()]);
        if (forma instanceof Circulo) {
            desenharCirculo(forma.getX(), forma.getY(), forma.getTamanho(), forma.isPreenchida());
        } else if (forma instanceof Quadrado) {
            desenharPoligono(forma.getX(), forma.getY(), forma.getTamanho(), 4, forma.isPreenchida());
        } else if (forma instanceof Pentagono) {
            desenharPoligono(forma.getX(), forma.getY(), forma.getTamanho(), 5, forma.isPreenchida());
        } else if (forma instanceof Hexagono) {
            desenharPoligono(forma.getX(), forma.getY(), forma.getTamanho(), 6, forma.isPreenchida());
        }
        draw.setPenColor(cores[forma.getIndiceCor()]);
    }

    private void desenharPoligono (double centroX, double centroY, double raio, int lados, boolean preenchida) {
        double[] xs = new double[lados];
        double[] ys = new double[lados];

        double offset = (lados == 4) ? Math.PI / 4 : 0; // Ajuste de 45 para o quadrado

        for (int i = 0; i < lados; i++) { // calcula os vértices do polígono
            double angulo = 2 * Math.PI * i / lados + offset;
            xs[i] = centroX + raio * Math.cos(angulo);
            ys[i] = centroY + raio * Math.sin(angulo);
        } if (preenchida) {
            draw.filledPolygon(xs, ys);
            draw.setPenColor(Color.BLACK);
        }
        draw.polygon(xs, ys);
    }

    private void desenharCirculo(double x, double y, double raio, boolean preenchida) {
        if (preenchida) {
            draw.filledCircle(x, y, raio);
            draw.setPenColor(Color.BLACK);
        }
        draw.circle(x, y, raio);
    }

    public void limparTela() {
        draw.clear();
    }
}