public class Veiculo {

    private static String marca;
    private static String modelo;
    private static int ano;
    private static double velocidadeAtual;
    private static boolean motorLigado;
    private static double combustivel;
    
    public double getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public void setCombustivel(double combustivel){
        this.combustivel += combustivel;
        
    }

    public double getCombustivel(){
        return combustivel;
    }

    public static void ligarMotor() {

        if (combustivel > 0){
            if (!motorLigado) {
                motorLigado = true;
                System.out.println(" Motor ligado.");
            } else {
                System.out.println(" Motor já está ligado!");
            }
        } else {
            System.out.println(" Veiculo sem combustivel!");
            System.out.println(" Combustivel: " + combustivel + " Litros");
        }

    }
       

    public static void desligarMotor() {

        if (motorLigado) {
            motorLigado = false;
            System.out.println(" Motor desligado.");
        } else {
            System.out.println(" Motor já está desligado!");
        }

    }


    public static void acelerar() {

        if (motorLigado){
            velocidadeAtual = velocidadeAtual + 5;
            combustivel -= 1;
        } else {
            System.out.println(" Veiculo está com o motor desligado");
        }

        System.out.println(" Velocidade atual: " + velocidadeAtual + " Km/h");
    }


    public static void frear() {

        if (motorLigado) {
            velocidadeAtual = velocidadeAtual - 5;
        } else {
            System.out.println(" Veiculo está com o motor desligado");
        }

        System.out.println(" Velocidade atual: " + velocidadeAtual + " Km/h");

    }


    public static void exibirInfo() {

        System.out.println(" Marca do veículo: " + marca);
        System.out.println(" Modelo do veículo: " + modelo);
        System.out.println(" Ano de fabricação do veículo: " + ano);

    }

}