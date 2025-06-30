package ifsc.poo;

public class Circulo extends Forma implements Informacoes {
    public Circulo(boolean preenchida, int tamanho) {
        super(preenchida, tamanho);
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