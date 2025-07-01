package ifsc.poo;
import edu.princeton.cs.algs4.DrawListener;
import java.awt.event.KeyEvent;


public class Comandos {
    private static final int TAMANHO_MINIMO = 50; // tamanho padrão das formas
    private static final int TAMANHO_MAXIMO = 200; // tamanho máximo das formas

    private List<Forma> figuras = new ArrayList<>();
    private int formaSelecionada; // 0: circulo, 1: quadrado, 2: pentágono, 3: hexágono
    private int indiceCor; // 0: preto, 1: azul, 2: verde, 3: roxo
    private boolean preenchida; // true: preenchida, false: não preenchida
    private int tamanho; // tamanho da forma, padrão 50
    private Desenhar desenhar; // instância da classe Desenhar

    public Comandos() {
        this.formaSelecionada = 0; 
        this.indiceCor = 0;
        this.preenchida = false;
        this.tamanho = 50;
        this.desenhar = new Desenhar();
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
        desenhar.limparTela();
    }

    public void mostarInformacoes() {
        
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
}