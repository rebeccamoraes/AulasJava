package atividades.atp24;

/**
 * Atividade Prática 24 - Herança e conversão de objetos
 * 
 * 1. Crie uma classe veiculo com atributos públicos: marca, modelo e placa.
 */
public class Veiculo {
    public String marca;
    public String modelo;
    public String placa;

    @Override
    public String toString() {
        String texto = "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nPlaca:" + this.placa + "\n";
        return texto;
    }
}
