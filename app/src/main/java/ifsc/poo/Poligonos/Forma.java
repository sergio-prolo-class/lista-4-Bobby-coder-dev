package ifsc.poo;

public abstract class Forma implements Propriedades {
    protected boolean preenchida;
    protected int tamanho;
    protected static int numFormas = 0;

    public Forma(boolean preenchida, int tamanho) {
        // padrão
        this.preenchida = preenchida;
        this.tamanho = tamanho;
        numFormas++;
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public boolean isPreenchida() {
        return preenchida;
    }
}
