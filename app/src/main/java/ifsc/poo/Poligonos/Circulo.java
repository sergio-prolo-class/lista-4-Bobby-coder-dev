package ifsc.poo;

public class Circulo extends Forma implements Informacoes {
    public Circulo(int x, int y, int tamanho, int indiceCor, boolean preenchida) {
        super(x, y, tamanho, indiceCor, preenchida);
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(tamanho, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * tamanho;
    }
}