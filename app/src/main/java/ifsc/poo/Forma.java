package ifsc.poo;

public abstract class Forma implements Propriedades {
    private boolean preenchida;
    private int tamanho;
    private static int numFormas = 0;

    public Forma(boolean preenchida, int tamanho) {
        // padrão
        this.preenchida = false;
        this.tamanho = 50;
        numFormas++;
    }

    @Override
    public void aumentarTamanho() {
        if (tamanho < 200) {
            this.tamanho += 10;
        }
    }

    @Override
    public void diminuirTamanho() {
        if (tamanho > 10) {
            this.tamanho -= 10;
        }
    }

    @Override
    public void alterarPreenchimento() {
        this.preenchida = !this.preenchida;
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
