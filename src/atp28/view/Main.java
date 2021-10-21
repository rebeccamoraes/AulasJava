package atp28.view;

import atp28.controller.PessoaFisicaController;
import atp28.model.Endereco;
import atp28.model.PessoaFisica;

/**
 * Teste de CRUDs dos controllers de PessoaFísica e PessoaJurídica
 */
public class Main {
    public static void main(String[] args) {
        testaPessoaFisicaController();
    }

    /**
     * Testa CRUD do PessoaFísicaController
     */
    private static void testaPessoaFisicaController() {
        PessoaFisicaController pessoas = new PessoaFisicaController();

        //CREATE
        Endereco endereco = new Endereco("Rua 1", "123-A", "qd 1, lt 2", "Setor Sul", "Rio de Janeiro", "RJ", "23456-123");
        PessoaFisica pessoa = new PessoaFisica("Denise Santos", "123.456.789-10", endereco);

        pessoas.create(pessoa);
        endereco = new Endereco("Rua 9-B", "44", "Apt 103", "Águas Claras", "Sorocaba", "SP", "11222-123");
        pessoas.create(new PessoaFisica("Flávia Nunes", "987.654.321-00", endereco));

        //READ
        for (PessoaFisica pf : pessoas.read()) {
            System.out.println(pf);
        }

        //UPDATE
        pessoa.endereco.logradouro = "Rua Bom Retiro";
        pessoa.nome = "Denise Anjos";

        System.out.println("--- Após update ---");
        for (PessoaFisica pf : pessoas.read()) {
            System.out.println(pf);
        }

        //DELETE
        pessoas.delete(pessoa);
        System.out.println("--- Após delete ---");
        for (PessoaFisica pf : pessoas.read()) {
            System.out.println(pf);
        }
    }
}
