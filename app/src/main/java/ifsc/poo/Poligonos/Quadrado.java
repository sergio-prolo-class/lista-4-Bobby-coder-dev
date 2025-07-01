package ifsc.poo;

public class Quadrado extends Forma implements Informacoes, Propriedades {
    private double lado;

    public Quadrado(boolean preenchida, int tamanho, double lado) {
        super(preenchida, tamanho);
        this.lado = 2 * getTamanho() * Math.sin(Math.PI / 4);
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public double getLado() {
        return lado;
    }

    @Override
    public void setLado(double lado) {
        this.lado = lado;
    }
}