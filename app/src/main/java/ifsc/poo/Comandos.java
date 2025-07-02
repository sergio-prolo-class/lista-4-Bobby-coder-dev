package ifsc.poo;
import edu.princeton.cs.algs4.DrawListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Comandos {
    private static final int TAMANHO_MINIMO = 10; // tamanho padrão das formas
    private static final int TAMANHO_MAXIMO = 200; // tamanho máximo das formas

    private List<Forma> figuras = new ArrayList<>();
    private int formaSelecionada; // 0: circulo, 1: quadrado, 2: pentágono, 3: hexágono
    private int indiceCor; // 0: preto, 1: azul, 2: verde, 3: roxo
    private boolean preenchida; // true: preenchida, false: não preenchida
    private int tamanho; 
    private Desenhar desenhar; 

    public Comandos(Desenhar desenhar) {
        this.formaSelecionada = 0; 
        this.indiceCor = 0;
        this.preenchida = false;
        this.tamanho = 50;
        this.desenhar = desenhar;
    }

    // Sets

    public void setFormaSelecionada(int forma) {
        this.formaSelecionada = forma;
    }

    public void setCor(int cor) {
        this.indiceCor = cor;
    }

    // Mudanças

    public void alterarPreenchida() {
        this.preenchida = !preenchida;
    }

    public void aumentarTamanho() {
        if (this.tamanho < TAMANHO_MAXIMO) {
            this.tamanho += 10;
        } else {
            System.out.println("Tamanho máximo atingido.");
        }
    }

    public void diminuirTamanho() {
        if (this.tamanho > TAMANHO_MINIMO) {
            this.tamanho -= 10;
        } else {
            System.out.println("Tamanho mínimo atingido.");
        }
    }

    public void limparTela(){
        figuras.clear();
        desenhar.limparTela();
    }

    public void moverFiguras(int deltaX, int deltaY) {
        desenhar.limparTela();
        for (Forma figura : figuras) {
            figura.x += deltaX;
            figura.y += deltaY;
            desenhar.desenharForma(figura);
        }
    }
    // Gets

    public int getFormaSelecionada() {
        return formaSelecionada;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public boolean getPreenchida() {
        return this.preenchida;
    }

    public int getCor() {
        return this.indiceCor;
    }

    // Desenho
    
    public void desenharForma(int x, int y) {
        Forma forma = null;
        switch (formaSelecionada) {
            case 0:
                forma = new Circulo(x, y, tamanho, indiceCor, preenchida);
                break;
            case 1:
                forma = new Quadrado(x, y, tamanho, indiceCor, preenchida);
                break;
            case 2:
                forma = new Pentagono(x, y, tamanho, indiceCor, preenchida);
                break;
            case 3:
                forma = new Hexagono(x, y, tamanho, indiceCor, preenchida);
                break;
        }
        if (forma != null) {
            figuras.add(forma);
            desenhar.desenharForma(forma);
        }
    }


// informações 

    public void mostarInformacoes() {
        System.out.println("Número de formas desenhadas: " + Forma.numFormas);
        int somaPerimetros = 0;
        

    }