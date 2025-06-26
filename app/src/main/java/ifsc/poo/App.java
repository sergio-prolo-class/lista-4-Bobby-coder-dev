package ifsc.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

public class App {

    public static void main(String[] args) {
        Draw draw = new Draw();
        Comandos comandos = new Comandos();

        draw.addListener(new DrawListener() {
            @Override
            public void keyTyped(char c) {
        
            }

            @Override
            public void keyPressed(int keycode) {
               
                switch (keycode) {
                    case 112: // F1
                        comandos.setFormaSelecionada(Quadrado.class);
                        System.out.println("Quadrado selecionado");
                        break;
                    case 113: // F2
                        comandos.setFormaSelecionada(Pentagono.class);
                        System.out.println("Pentágono selecionado");
                        break;
                    case 114: // F3
                        comandos.setFormaSelecionada(Hexagono.class);
                        System.out.println("Hexágono selecionado");
                        break;
                    case 115: // F4
                        comandos.setFormaSelecionada(Circulo.class);
                        System.out.println("Círculo selecionado");
                        break;
                }
            }

            // Implemente outros métodos do DrawListener conforme necessário
            @Override public void mousePressed(double x, double y) {}
            @Override public void mouseDragged(double x, double y) {}
            @Override public void mouseReleased(double x, double y) {}
        });
    }
}