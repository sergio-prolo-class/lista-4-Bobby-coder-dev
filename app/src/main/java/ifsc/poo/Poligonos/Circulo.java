package ifsc.poo;

public class Circulo extends Forma implements Informacoes {
    private double raio;

    public Circulo(boolean preenchida, int tamanho, double raio) {
        super(preenchida, tamanho);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}