package ifsc.poo;

public class Pentagono extends Forma implements Informacoes, Propriedades {
    private double lado;
    private int numeroLados = 5;

    public Pentagono(int x, int y, int tamanho, int indiceCor, boolean preenchida) {
        super(x, y, tamanho, indiceCor, preenchida);
        this.lado = 2 * getTamanho() * Math.sin(Math.PI / 5);
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(lado, 2)) / 4;
    }

    @Override
    public double calcularPerimetro() {
        return 5 * lado;
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