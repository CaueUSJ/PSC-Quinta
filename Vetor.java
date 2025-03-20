
import javax.swing.JOptionPane;

public class Matriz{
    public static void main(String[] args){

        /**
         * Declarar matrizes
         * 
         * int[] vetor = new int[tamanho];
         * int vetor[] = new int[tamanho];
         * 
         * int[][] matriz;
         * int matriz[][];
         */

         int vetor[] = new int[5];
         String nome[] = new String[4];

         vetor[0] = 14;
         vetor[1] = 28;

        
        for (int i = 0; i < nome.length; i++){
            nome[i] = JOptionPane.showInputDialog("Digite um nome: ");

        }

        // For para percorrer todo elemento de uma matriz
        for (String i : nome){
            System.out.println(i);

        }

        String endereco[][] = new String[5][5];

        for (int i = 0; i < endereco.length; i++){
            for (int j = 0; j < endereco[i].length; j++){
                endereco[i][j] = JOptionPane.showInputDialog(null, "Endereço: ");
            }

        }

        for (String[] row : endereco) {
            for (String i : row) {
                System.out.println(i);
             }
        }
        
    }

}