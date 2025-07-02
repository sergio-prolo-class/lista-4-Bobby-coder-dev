package ifsc.poo;

public abstract class Forma implements Informacoes {
    protected boolean preenchida;
    protected int tamanho;
    protected int x;
    protected int y;
    protected int indiceCor;

    public Forma(int x, int y,  int tamanho, int indiceCor, boolean preenchida) {
        // padrão
        this.x = x;
        this.y = y;
        this.tamanho = tamanho;
        this.indiceCor = indiceCor;
        this.preenchida = preenchida;
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
