package atp26;

/**
 * Atividade Prática 26 - Conversão, sobrescrita e arrays
 * 
 * 1. Crie uma classe Dados com um atributo privado do tipo array de Object.
 * 2. Crie uma inicialização do array para 5 posições dentro do do método construtor da classe.
 * 3. Crie um método para adicionar elementos ao array e que permita receber tanto objetos da
 *    classe pessoa quanto objetos da classe Aluno. Caso o array já tenha todas as posições ocupadas, 
 *    deve ser adicionado mais 5 posições ao array.
 * 4. Crie um método para mostrar quantos elementos já foram adicionados ao array.
 */
public class Dados {
    private Object[] lista;
    private int tamanhoAtual;

    public Dados() {
        this.tamanhoAtual = 0;
        this.lista = new Object[5];
    }

    /**
     * Adiciona objeto do tipo Aluno ou Pessoa à lista.
     * Caso a lista esteja cheia, é redimencionada em mais 5 posições.
     */
    public void add(Object obj) {
        if(lista.length >= this.tamanhoAtual) {
            Object[] novaLista = new Object[this.tamanhoAtual + 5];

            for (int i = 0; i < tamanhoAtual; i++) {
                novaLista[i] = this.lista[i];
            }

            this.lista = novaLista;
        }

        lista[tamanhoAtual] = obj;
        
        tamanhoAtual++;
    }

    /**
     * Mostra quantos elementos já foram adicionados ao array.
     */
    public int length() {
        return this.tamanhoAtual;
    }
}
