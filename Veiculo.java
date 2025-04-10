public class Veiculo {

    static String marca;
    static String modelo;
    static int ano;
    static double velocidadeAtual;
    static boolean motorLigado;
    static double combustivel;
    
    public static void ligarMotor() {

        if (motorLigado == false) {
            motorLigado = true;
            System.out.println(" Motor ligado.");
        } else {
            System.out.println(" Motor já está ligado!");
        }

    }

    public static void desligarMotor() {

         if (motorLigado == true) {
            motorLigado = false;
            System.out.println(" Motor desligado.");
        } else {
            System.out.println(" Motor já está desligado!");
        }

    }

    public static double acelerar() {

        velocidadeAtual = velocidadeAtual + 5;

        return velocidadeAtual;
    }

    public static double frear() {

        velocidadeAtual = velocidadeAtual - 5;

        return velocidadeAtual;
    }

    public static void exibirInfo() {

        System.out.println(" Marca do veículo: " + marca);
        System.out.println(" Modelo do veículo: " + modelo);
        System.out.println(" Ano de fabricação do veículo: " + ano);

    }

}