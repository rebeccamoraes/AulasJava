package atividades.atp15;

class Programa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Ada";
        pessoa1.sobrenome = "Lovelace";
        pessoa1.idade = 2021 - 1815;

        Pessoa pessoa2 = new Pessoa();

        pessoa2.nome = "Alan";
        pessoa2.sobrenome = "Turing";
        pessoa2.idade = 2021 - 1912;

        System.out.printf("Pessoa 1: %s %s, %d anos.\n", pessoa1.nome, pessoa1.sobrenome, pessoa1.idade);
        System.out.printf("Pessoa 2: %s %s, %d anos.\n", pessoa2.nome, pessoa2.sobrenome, pessoa2.idade);
    }
}