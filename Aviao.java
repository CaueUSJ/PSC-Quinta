public class Aviao extends Veiculo{
    private double altitude;
    private boolean tremDePousoAbaixado;
    
    public Aviao(String marca, String modelo, int ano, double combustivel){
        super(marca, modelo, ano, combustivel);
        this.altitude = 0;
        this.tremDePousoAbaixado = true;
    }

    @Override
    public void acelerar(){
        super.acelerar();
        super.setVelocidadeAtual(240);
    }

    public void decolar(){
        if (this.altitude == 0 && super.getMotorLigado()){
            this.acelerar();
            this.altitude = 10000;
            this.tremDePousoAbaixado = false;
            System.out.println(" Avião decolou!");
        } else {
            System.out.println(" Avião já está em vôo");
        }
    }

    public void subir(){
        if(this.altitude > 0){
            this.altitude += 1000;
            System.out.println(" Avião subiu para " + this.altitude +" metros");
        } else {
            System.out.println(" Avião está no chão!");
        }
    }

    public void descer(){
        if(this.altitude > 0){
            this.altitude -= 1000;
            System.out.println(" Avião desceu para " + this.altitude +" metros");
        } else {
            System.out.println(" Avião está no chão!");
        }
    }

    public void aterrisar(){
        while(this.altitude > 0){ 
            if(this.altitude <= 1000){
                this.tremDePousoAbaixado = true;
                System.out.println("Trem de pouso baixado.");
            } else 
            this.altitude -= 1000;
            System.out.println(" Altitude: " + altitude + " metros");
        }
        System.out.println(" Avião aterrissou!");
    }

}