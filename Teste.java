
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        
        double abastecer = 5.0;

        Scanner scanner = new Scanner(System.in);        
        Veiculo veiculo = new Veiculo();

        boolean inicio = true; 
        int turno = 1;

        while (inicio) {

            System.out.println("------------------------------------------------------");
            System.out.println("                     TURNO " + turno);
            System.out.println("------------------------------------------------------");
            System.out.println("               Velocidade atual: " + veiculo.getVelocidadeAtual() + " Km/h");

            if (veiculo.getMotorLigado()){
                System.out.println("               Estado do motor: Ligado!");
            } else {
                System.out.println("               Estado do motor: Desligado!");
            }
            
            System.out.println("               Combustivel: " + veiculo.getCombustivel() + " Litros");
            System.out.println("------------------------------------------------------");

            System.out.println("              Digite um comando: ");
            System.out.println("------------------------------------------------------");
            System.out.println("               [1] Ligar motor ");
            System.out.println("               [2] Desligar motor ");
            System.out.println("               [3] Abastecer veiculo ");
            System.out.println("               [4] Acelerar ");
            System.out.println("               [5] Frear ");
            System.out.println("               [6] Informações do veiculo ");
            System.out.println("               [7] Sair ");

            int command = scanner.nextInt();


            switch (command) {
                case 1 -> veiculo.ligarMotor();
                case 2 -> veiculo.desligarMotor();
                case 3 -> veiculo.setCombustivel(abastecer);
                case 4 -> veiculo.acelerar();
                case 5 -> veiculo.frear();
                case 6 -> veiculo.exibirInfo();
                default -> {
                    System.out.println("               Saindo...");
                    inicio = false;
                    }
            }

            System.out.println("------------------------------------------------------");
            turno++;

        }
    }
}
