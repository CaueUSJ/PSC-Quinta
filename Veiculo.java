public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    private boolean motorLigado;
    private double combustivel;
    

    // Métodos Set e Get 
    public void setMarca(String marca){
        this.marca = marca;        
    }

    public String getMarca(){
        return marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;        
    }

    public String getModelo(){
        return modelo;
    }

    public void setAno(int ano){
        this.ano = ano;        
    }

    public int getAno(){
        return ano;
    }

    public void setVelocidadeAtual(){

    }

    public double getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public void setCombustivel(double combustivel){
        this.combustivel += combustivel;
        
    }

    public double getCombustivel(){
        return combustivel;
    }

    public void setMotorLigado(){
        
    }

    public boolean getMotorLigado(){
        return motorLigado;
    }

    
    // Metodos 

    /** Regras para ligarMotor()
     * 1. Verifique se o motor está desligado.
     * 2. Se estiver desligado, ligue o motor e mostre a mensagem:
     * "Motor ligado!"
     * 3. Caso contrário, informe que o motor já está ligado.
     */

    public void ligarMotor() {

        if (this.combustivel > 0){
            if (!this.motorLigado) {
                this.motorLigado = true;
                System.out.println(" Motor ligado.");
            } else {
                System.out.println(" Motor já está ligado!");
            }
        } else {
            System.out.println(" Veiculo sem combustivel!");
            System.out.println(" Combustivel: " + this.combustivel + " Litros");
        }

    }
       

    /** Regras para desligarMotor()
     * 1. Verifique se o motor está ligado.
     * 2. Se estiver ligado, desligue o motor e mostre a mensagem: 
     * "Motor desligado!"
     * 3. Caso contrário, informe que o motor já está desligado.
     */

    public void desligarMotor() {

        if (this.motorLigado) {
            this.motorLigado = false;
            System.out.println(" Motor desligado.");
        } else {
            System.out.println(" Motor já está desligado!");
        }

    }

    /** Regras para acelerar()
     * 1. Verifique se o motor está ligado. Se não estiver, exiba uma mensagem
     * informando que não é possível acelerar.
     * 2. Verifique se há combustível. Se estiver zerado ou negativo,
     * exiba uma mensagem informando que não há combustível.
     * 3. Se as duas condições acima forem atendidas, aumente a velocidade em 10 Km/h.
     * 4. Reduza o combustível em 0.5 litros.
     * 5. Exiba a mensagem informando a nova velocidade
     */

    public void acelerar() {

        if (this.combustivel > 0){
            if (this.motorLigado){
                this.velocidadeAtual = this.velocidadeAtual + 10;
                this.combustivel -= 0.5;
                if (this.combustivel <= 0){
                    this.combustivel = 0;
                }
            } else {
                System.out.println(" Veiculo está com o motor desligado");
            }
        } else {
            System.out.println(" Veiculo está sem combustivel, não é possivel acelerar!");
        }
        
        System.out.println(" Velocidade atual: " + this.velocidadeAtual + " Km/h");
    }

    /** Regras para frear()
     * 1. Verifique se a velocidade atual é maior que zero.
     * 2. Caso seja, reduza a velocidade em 10 Km/h.
     * 3. Se após reduzir, a velocidade ficar abaixo de zero, ajuste para zero.
     * 4. Exiba uma mensagem informando a nova velocidade.
     * 5. Caso a velocidade já estaja zero, informe que o veiculo já está parado.
     */
    public void frear() {

        if (this.velocidadeAtual > 0) {
            this.velocidadeAtual = this.velocidadeAtual - 10;
            if (this.velocidadeAtual <= 0){
                this.velocidadeAtual = 0;
            }
        } else {
            System.out.println(" Veiculo já está parado!");
        }

        System.out.println(" Velocidade atual: " + this.velocidadeAtual + " Km/h");

    }

    /** Regras para exibirInfo()
     * 1. Exibir a marca, o modelo e o ano do veículo.
     * 2. Exiba o estado do motor (ligado ou desligado).
     * 3. Exiba a velocidade atual em Km/h.
     * 4. Exiba a quantidade de combustível em litros.
     */
    public void exibirInfo() {

        System.out.println(" Marca do veículo: " + this.marca);
        System.out.println(" Modelo do veículo: " + this.modelo);
        System.out.println(" Ano de fabricação do veículo: " + this.ano);
        
        if (this.motorLigado){
            System.out.println(" Estado do motor: Ligado!");
        } else {
            System.out.println(" Estado do motor: Desligado!");
        }

        System.out.println(" Velocidade atual: " + this.velocidadeAtual + " Km/h");
        System.out.println(" Quantidade de combustivel: " + this.combustivel + " Litros");


    }

}