package aulas.modulo2.aula13;

public class ArrayCategoria {
    public static void main(String[] args) {
        Categoria[] categorias = new Categoria[5];

        Categoria cat1 = new Categoria("Eletro", "Eletroeletronico");
        Categoria cat2 = new Categoria("Smartphones", "Telefones que tem apps");

        categorias[0] = cat1;
        categorias[1] = cat2;
        categorias[2] = new Categoria();
        categorias[3] = new Categoria("Calçados", "Sapatos e tenis");
        categorias[4] = new Categoria();

        for (Categoria categoria: categorias) {
            System.out.printf("Nome: %s \nDescrição: %s\n", categoria.getNome(), categoria.getDescricao());
        }
    }
}
