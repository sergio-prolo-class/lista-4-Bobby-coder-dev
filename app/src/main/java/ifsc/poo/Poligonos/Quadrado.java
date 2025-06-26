package ifsc.poo;

public class Quadrado extends Forma implements Informacoes {
    private double lado;

    public Quadrado(boolean preenchida, int tamanho, double lado) {
        super(preenchida, tamanho);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}