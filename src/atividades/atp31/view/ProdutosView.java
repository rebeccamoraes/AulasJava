package atividades.atp31.view;

import java.util.Scanner;

import atividades.atp31.controller.ProdutosController;
import atividades.atp31.model.Produto;

public class ProdutosView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProdutosController controller = new ProdutosController();

        do {
            int opcao = menu(scanner);

            switch(opcao) {
                case 1:
                    create(scanner, controller);
                    break;
                
                case 2:
                    update(scanner, controller);
                    break;

                case 3:
                    delete(scanner, controller);
                    break;
                
                case 4:
                    list(controller);
                    break;
            }
        } while(voltarAoMenu(scanner));

        scanner.close();
    }

    /**
     * Exibe o menu e lê uma opção
     * 
     * @param scanner entrada de dados
     * @return opção escolhida
     */
    private static int menu(Scanner scanner) {
        int opcao = 0;
        boolean opcaoInvalida = false;

        do {
            String mensagem = "----- Menu Produtos -----\n"
                            + "\t1. Criar \n\t2. Atualizar \n\t3. Excluir \n\t4. Listar"
                            + "\nEscolha uma opção: ";
            
            opcao = lerInteiro(scanner, mensagem);

            opcaoInvalida = opcao < 1 || opcao > 4;

            if (opcaoInvalida) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcaoInvalida);

        return opcao;
    }
    
    private static boolean voltarAoMenu(Scanner scanner) {
        char resposta = ' ';

        System.out.println("\nDeseja voltar ao menu? (S\\N)");
        resposta = scanner.nextLine().toUpperCase().charAt(0);
        System.out.println();

        return resposta == 'S';
    }

    
    private static void create(Scanner scanner, ProdutosController controller) {
        System.out.println("---- Cadastro de produto ----");

        Produto produto = new Produto();
        
        System.out.print("Nome: ");
        produto.setNome(scanner.nextLine());
        System.out.print("Descrição: ");
        produto.setDescricao(scanner.nextLine());
        produto.setPreco(lerDouble(scanner, "Preço: "));
        System.out.print("Categoria: ");
        produto.setCategoria(scanner.nextLine());

        controller.create(produto);
    }
    
    private static void list(ProdutosController controller) {
        System.out.println("---- Lista de produtos ----");
        for (Produto produto : controller.read()) {
            System.out.println(produto);
        }
    }

    private static void update(Scanner scanner, ProdutosController controller) {
        System.out.println("---- Atualização de produto ----");
        try {
            int id = lerInteiro(scanner, "Id: ");
            Produto produto = (controller.findById(id));

            System.out.print("Nome: ");
            produto.setNome(scanner.nextLine());
            System.out.print("Descrição: ");
            produto.setDescricao(scanner.nextLine());
            produto.setPreco(lerDouble(scanner, "Preço: "));
            System.out.print("Categoria: ");
            produto.setCategoria(scanner.nextLine());

            controller.update(produto);

            System.out.println("Produto atualizado com sucesso.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static void delete(Scanner scanner, ProdutosController controller) {
        System.out.println("---- Exclusão de produto ----");
        try {
            int id = lerInteiro(scanner, "Id: ");

            Produto produto = (controller.findById(id));

            controller.delete(produto);

            System.out.println("Produto excluído com sucesso.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    private static int lerInteiro(Scanner scanner, String mensagem) {
        boolean numeroInvalido = false;
        int numero = 0;
        do {
            try {
                System.out.print(mensagem);
                numero = Integer.parseInt(scanner.nextLine());
                numeroInvalido = false; 
            } catch (NumberFormatException e) {
                System.out.println("Erro. O número precisa ser inteiro.");
                numeroInvalido = true;
            }
        } while (numeroInvalido);
        return numero;
    }

    private static double lerDouble(Scanner scanner, String mensagem) {
        boolean numeroInvalido = false;
        double numero = 0;
        do {
            try {
                System.out.print(mensagem);
                numero = Double.parseDouble(scanner.nextLine());
                numeroInvalido = false; 
            } catch (NumberFormatException e) {
                System.out.println("Erro. Valor informado não é um número.");
                numeroInvalido = true;
            }
        } while (numeroInvalido);
        return numero;
    }
}
