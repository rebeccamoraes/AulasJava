package atividades.atp28.view;

import atividades.atp28.controller.PessoaFisicaController;
import atividades.atp28.controller.PessoaJuridicaController;
import atividades.atp28.model.Endereco;
import atividades.atp28.model.PessoaFisica;
import atividades.atp28.model.PessoaJuridica;

/**
 * Teste de CRUDs dos controllers de PessoaFísica e PessoaJurídica
 */
public class Main {
    public static void main(String[] args) {
        testaPessoaFisicaController();
        testaPessoaJuridicaController();
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

    /**
     * Testa CRUD do PessoaJuridicaController
     */
    private static void testaPessoaJuridicaController() {
        PessoaJuridicaController pessoas = new PessoaJuridicaController();

        //CREATE
        Endereco endereco = new Endereco("Av. Brasil", "1.776", "Quadra 8", "Bonsucesso", "Rio de Janeiro", "RJ", "23456-123");
        PessoaJuridica pessoa = new PessoaJuridica("Bradesco", "60.697.021/0001-30", endereco);

        pessoas.create(pessoa);
        endereco = new Endereco("Rua 1009", "9.743", "Torre 1", "Águas Claras", "Brasília", "DF", "11222-123");
        pessoas.create(new PessoaJuridica("Capgemini", "63.624.700/0001-77", endereco));

        //READ
        for (PessoaJuridica pj : pessoas.read()) {
            System.out.println(pj);
        }

        //UPDATE
        pessoa.endereco.logradouro = "Rua Porto Alegre";
        pessoa.razaoSocial = "Banco do Brasil";

        System.out.println("--- Após update ---");
        for (PessoaJuridica pj : pessoas.read()) {
            System.out.println(pj);
        }

        //DELETE
        pessoas.delete(pessoa);
        System.out.println("--- Após delete ---");
        for (PessoaJuridica pj : pessoas.read()) {
            System.out.println(pj);
        }
    }
}
