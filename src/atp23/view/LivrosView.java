package atp23.view;

import java.util.ArrayList;
import java.util.Scanner;

import atp23.controller.LivrosController;
import atp23.model.Livro;

public class LivrosView {
    public static void main(String[] args) {
        LivrosController controller = new LivrosController();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            opcao = menu(scanner);

            switch(opcao) {
                case 1:
                    cadastrar(controller, scanner);
                    break;

                case 2:
                    alterar(controller, scanner);
                    break;

                case 3: 
                    excluir(controller, scanner);
                    break;
                
                case 4:
                    listar(controller);
                    break;
            }
        } while(voltarAoMenu(scanner));

        scanner.close();
    }

    private static void cadastrar(LivrosController controller, Scanner scanner) {
        System.out.println("--------  Cadastro de livro  --------");

        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        
        System.out.print("Autores: ");
        String autores = scanner.nextLine();
        
        System.out.print("Editora: ");
        String editora = scanner.nextLine();
        
        Livro livro = new Livro(titulo, autores, editora);

        controller.create(livro);

        System.out.println("Livro criado com sucesso!");      
    }

    private static void alterar(LivrosController controller, Scanner scanner) {
        System.out.println("--------  Alteração de livro  --------");

        System.out.println("Informe o id do livro: ");
        int id = Integer.parseInt(scanner.nextLine());

        try {
            Livro livro = controller.findById(id);
            
            System.out.printf("Novo título (%s): ", livro.getTitulo());
            livro.setTitulo(scanner.nextLine());
            
            System.out.printf("Novos autores (%s): ", livro.getAutores());
            livro.setAutores(scanner.nextLine());
            
            System.out.printf("Nova editora (%s): ", livro.getEditora());
            livro.setEditora(scanner.nextLine());

            controller.update(livro);

            System.out.println("Livro alterado com sucesso!");
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static void excluir(LivrosController controller, Scanner scanner) {
        System.out.println("--------  Exclusão de livro  --------");
        System.out.println("Informe o id do livro: ");
        int id = Integer.parseInt(scanner.nextLine());

        try {
            Livro livro = controller.findById(id);
            
            controller.delete(livro);

            System.out.println("Livro excluído com sucesso!");
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static void listar(LivrosController controller) {
        ArrayList<Livro> livros = controller.read();

        System.out.println("--------  Lista de livros  --------");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    private static int menu(Scanner scanner) {
        int opcao = 0;
        boolean valorInvalido = false;

        do {
            System.out.println("--------  Menu Livros  --------");
            System.out.println("\t1. Cadastrar\n\t2. Alterar\n\t3. Excluir\n\t4. Listar\n");
            System.out.print("\nInforme a opção desejada: ");
            opcao = Integer.parseInt(scanner.nextLine());

            valorInvalido = opcao < 1 || opcao > 4;

            if (valorInvalido) {
                System.out.println("Valor inválido.");
            }
        } while (valorInvalido);


        return opcao;
    }

    private static boolean voltarAoMenu(Scanner scanner) {
        char resposta = ' ';

        System.out.println("\nDeseja voltar ao menu? (S\\N)");
        resposta = scanner.nextLine().toUpperCase().charAt(0);

        return resposta == 'S';
    }
}
