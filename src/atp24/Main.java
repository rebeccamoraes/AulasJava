package atp24;

/**
 * Atividade Prática 24 - Herança e conversão de objetos
 * 
 * 1. Crie uma classe Main com um método main.
 * 2. Crie um objeto de classe Veículo e um de classe Carro e atribua valores para as propriedade 
 *    de cada objeto.
 * 3. Crie um objeto da classe Object através da instância da classe Veículo.
 * 4. Crie um objeto da classe Object através da instância da classe Carro.
 * 5. Converta o primeiro objeto da Object novamente para um novo objeto da classe Veículo.
 * 6. Converta o segundo objeto da Object novamente para um novo objeto da classe Carro.
 * 7. Imprima todos dos dados do objeto de Veículo convertido.
 * 8. Imprima todos dos dados do objeto de Carro convertido.
 */
public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Carro carro = new Carro();

        veiculo.marca = "Renault";
        veiculo.modelo = "Kwid";
        veiculo.placa = "AAA1234";

        carro.capacidadePortaMalas = 200;
        carro.numeroPortas = 4;

        Object objVeiculo = veiculo;
        Object objCarro = carro;

        Veiculo veiculoObj = (Veiculo) objVeiculo;
        Carro carroObj = (Carro) objCarro;

        System.out.printf("---- Veiculo Convertido----\n%s", veiculoObj);
        System.out.printf("---- Carro Convertido----\n%s", carroObj);

        System.out.println();
    }
}
