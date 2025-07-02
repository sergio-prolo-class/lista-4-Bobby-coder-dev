package ifsc.poo;

public class Hexagono extends Forma implements Informacoes, Propriedades {
    private double lado;
    private int numeroLados = 6;

    public Hexagono(int x, int y, int tamanho, int indiceCor, boolean preenchida) {
        super(x, y, tamanho, indiceCor, preenchida);
        this.lado = 2 * getTamanho() * Math.sin(Math.PI / numeroLados);
    }

    @Override
    public double calcularArea() {
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 6 * lado;
    }

    @Override
    public double getLado() {
        return lado;
    }

    @Override
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public int getNumLados() {
        return numeroLados;
    }
}