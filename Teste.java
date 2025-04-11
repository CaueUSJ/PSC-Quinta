
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);        
        Veiculo veiculo = new Veiculo();

        boolean inicio = true; 
        int turno = 1;

        while (inicio) {

            System.out.println("---------------------------");
            System.out.println("       TURNO " + turno);
            System.out.println("---------------------------");
            System.out.println("Velocidade atual: " + veiculo.getVelocidadeAtual() + " Km/h");
            System.out.println("Combustivel: " + veiculo.getCombustivel() + " Litros");
            System.out.println("---------------------------");

            System.out.println("Digite um comando: ");
            System.out.println("---------------------------");
            System.out.println(" [1] Ligar motor ");
            System.out.println(" [2] Desligar motor ");
            System.out.println(" [3] Abastecer veiculo ");
            System.out.println(" [4] Acelerar ");
            System.out.println(" [5] Frear ");
            System.out.println(" [6] Informações do veiculo ");
            System.out.println(" [7] Sair ");

            int command = scanner.nextInt();


            switch (command) {
            case 1:
                veiculo.ligarMotor();
                break;
            case 2:
                veiculo.desligarMotor();
                break;
            case 3:
                veiculo.setCombustivel(5.0);
                break;
            case 4:
                veiculo.acelerar();
                break;
            case 5:
                veiculo.frear();
                break;
            case 6:
                veiculo.exibirInfo();
                break;
            default:
                System.out.println("Saindo...");
                inicio = false;
            }

            System.out.println("---------------------------");
            turno++;

        }
    }
}
