package ifsc.poo;

public abstract class Forma {
    protected boolean preenchida;
    protected int tamanho;
    protected int x;
    protected int y;
    protected int indiceCor;
    protected static int numFormas = 0;

    public Forma(int x, int y,  int tamanho, int indiceCor, boolean preenchida) {
        // padrão
        this.x = x;
        this.y = y;
        this.tamanho = tamanho;
        this.indiceCor = indiceCor;
        this.preenchida = preenchida;
        // incrementa o número de formas
        numFormas++;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean isPreenchida() {
        return preenchida;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getIndiceCor() {
        return indiceCor;
    }

}
