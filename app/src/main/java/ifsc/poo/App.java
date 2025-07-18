package ifsc.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;
import java.awt.event.KeyEvent;

public class App {
    public static void main(String[] args) {
        Desenhar desenhar = new Desenhar();
        Comandos comandos = new Comandos(desenhar);

        System.out.println("Desenho iniciado. Digite \"z\" para sair.");

        // Adiciona o listener ao Draw
        desenhar.getDraw().addListener(new DrawListener() {
            @Override
            public void keyPressed(int keyCode) {
                switch (keyCode) {

                    // Formas

                    case KeyEvent.VK_F1:
                        comandos.setFormaSelecionada(0);
                        System.out.println("Forma selecionada: Círculo");
                        break;
                    case KeyEvent.VK_F2:
                        comandos.setFormaSelecionada(1);
                        System.out.println("Forma selecionada: Quadrado");
                        break;
                    case KeyEvent.VK_F3:
                        comandos.setFormaSelecionada(2);
                        System.out.println("Forma selecionada: Pentágono");
                        break;
                    case KeyEvent.VK_F4:
                        comandos.setFormaSelecionada(3);
                        System.out.println("Forma selecionada: Hexágono");
                        break;

                    // Cores
                    
                    case KeyEvent.VK_F5:
                        comandos.setCor(0);
                        System.out.println("Cor selecionada: Preto");
                        break;
                    case KeyEvent.VK_F6:
                        comandos.setCor(1);
                        System.out.println("Cor selecionada: Azul");
                        break;
                    case KeyEvent.VK_F7:
                        comandos.setCor(2);
                        System.out.println("Cor selecionada: Verde");
                        break;
                    case KeyEvent.VK_F8:
                        comandos.setCor(3);
                        System.out.println("Cor selecionada: Laranja");
                        break;

                    // Mover figuras


                    // Movimento de 5 pixels para maior impressão visual

                    case KeyEvent.VK_LEFT:
                        comandos.moverFiguras(-5, 0);
                        break;
                    case KeyEvent.VK_RIGHT:
                        comandos.moverFiguras(5, 0);
                        break;
                    case KeyEvent.VK_UP:
                        comandos.moverFiguras(0, 5);
                        break;
                    case KeyEvent.VK_DOWN:

                        comandos.moverFiguras(0, -5);
                        break;
                }
            }

            @Override
            public void keyTyped(char c) {
                switch (c) {
                    case 'f':
                        comandos.alterarPreenchida();
                        System.out.println("Preenchimento alterado: " + (comandos.getPreenchida() ? "Preenchido" : "Não preenchido"));
                        break;
                    case 'q':
                        comandos.diminuirTamanho();
                        System.out.println("Tamanho: " + comandos.getTamanho());
                        break;
                    case 'w':
                        comandos.aumentarTamanho();
                        System.out.println("Tamanho: " + comandos.getTamanho());
                        break;
                    case 'c':
                        comandos.limparTela();
                        break;
                    case 'p':
                        comandos.mostarInformacoes();
                        break;
                    case 'z':
                        System.out.println("Saindo do desenho.");
                        desenhar.getDraw().close();
                        System.exit(0);
                        break;
                }
            }

            @Override
            public void mousePressed(double x, double y) {
                comandos.desenharForma((int) x, (int) y);
            }
        });
    }
}