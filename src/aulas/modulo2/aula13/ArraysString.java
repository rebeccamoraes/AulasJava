package aulas.modulo2.aula13;

public class ArraysString {
   public static void main(String[] args) {
        String[] nomes = new String[5];

        //Valor Default para Strings == null  
        System.out.println(nomes[0]);

        nomes[0] = "Alessandra";
        nomes[1] = "Bruna";
        nomes[2] = "Cintia";
        nomes[3] = "Flávia";
        nomes[4] = "Gisele";

        //pecorrendo o array com foreach
        for(String nome: nomes) {
            System.out.println(nome);
        }

        //pecorrendo o array com for
        for(int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
   }
}
