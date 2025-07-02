package ifsc.poo;

public class Quadrado extends Forma implements Informacoes, Propriedades {
    private double lado;
    private int numeroLados = 4;

    public Quadrado(int x, int y, int tamanho, int indiceCor, boolean preenchida) {
        super(x, y, tamanho, indiceCor, preenchida);
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
    
    @Override
    public int getNumLados() {
        return numeroLados;
    }
}