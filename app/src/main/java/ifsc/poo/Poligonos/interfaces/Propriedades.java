package ifsc.poo;

public interface Propriedades {
    // Define os métodos que devem ser implementados pelas classes que usam esta interface
    void aumentarTamanho();
    void diminuirTamanho();
    void alterarPreenchimento();

    // Método para obter o tamanho atual
    int getTamanho();

    // Método para verificar se a forma está preenchida
    boolean isPreenchida();
}