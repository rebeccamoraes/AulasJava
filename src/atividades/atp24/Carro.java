package atividades.atp24;

/**
 * Atividade Prática 24 - Herança e conversão de objetos
 * 
 * 1. Crie uma classe carro com os atributos públicos: número de portas e capacidade do porta-malas.
 */
public class Carro {
    public int numeroPortas;
    public int capacidadePortaMalas;

    @Override
    public String toString() {
        String texto = "Número de portas: " + this.numeroPortas
                     + "\nCapacidade do porta-malas: " + this.capacidadePortaMalas + "\n";
        return texto;
    }
}
