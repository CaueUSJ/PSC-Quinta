
import javax.swing.JOptionPane;

public class Vetor{
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

        // For-each  para percorrer todo elemento de uma matriz
        for (String i : nome){
            System.out.println(i);

        }
        
    }

}