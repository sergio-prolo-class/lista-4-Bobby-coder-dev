package ifsc.poo;

public class Hexagono extends Forma implements Informacoes {
    private double lado;

    public Hexagono(boolean preenchida, int tamanho, double lado) {
        super(preenchida, tamanho);
        this.lado = 2 * getTamanho() * Math.sin(Math.PI / 6);
    }

    @Override
    public double calcularArea() {
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 6 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}