package ifsc.poo;

public class Pentagono extends Forma implements Informacoes {
    private double lado;

    public Pentagono(boolean preenchida, int tamanho, double lado) {
        super(preenchida, tamanho);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(lado, 2)) / 4;
    }

    @Override
    public double calcularPerimetro() {
        return 5 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}