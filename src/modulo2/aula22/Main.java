package modulo2.aula22;

public class Main {
    public static void main(String[] args) {
        Produto prod1 = new Produto();
        Eletrodomestico eletro1 = new Eletrodomestico();

        Produto p2 = eletro1;

        System.out.println(Produto.class == prod1.getClass());
        System.out.println();
        System.out.println(p2.getClass());
    }
}
