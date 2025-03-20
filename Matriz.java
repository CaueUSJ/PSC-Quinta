import javax.swing.JOptionPane;

public class Matriz {
    public static void main(String[] args) {

        // Utilizar matrizes
        String endereco[][] = new String[2][2];

        for (int i = 0; i < endereco.length; i++) {
            for (int j = 0; j < endereco[i].length; j++) {
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
