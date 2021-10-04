package atp18;

/**
 * Atividade Prática 18 - Orientação à Objetos
 * 
 * 1. Crie uma classe Tela Principal Loja que contenha um método main. Nesta classe:
 * a) crie um objeto da Produto
 * b) realize a chamada a todos os métodos set e get
 * c) ao final da execução, imprima o valor de todos os atributos da classe.
 */
public class TelaPrincipalLoja {
    public static void main(String[] args) {
        Produto produto = new Produto();
        
        produto.setCodigo("111110");
        produto.setNome("Notebook lenovo");
        produto.setDescricao("1tb HD, 6bg RAM");
        produto.setValor(2500.00);

        System.out.printf("---- Produto ----\n");
        System.out.printf("Codigo: %s \nNome: %s \n", produto.getCodigo(), produto.getNome());
        System.out.printf("Descricao: %s \nValor: R$%.2f\n", produto.getDescricao(), produto.getValor());
    }
}