public class Main01 {
    
    public static void main(String[] args) {
        SUV suv = new SUV();

        suv.setMarca("Hyundai ");
        suv.setModelo("ix35 ");
        suv.setAno(2018);
        suv.setVolumePortaMalas(465);
        

        System.out.println("Marca: " + suv.getMarca());
        System.out.println("Modelo: " + suv.getModelo());
        System.out.println("Ano: " + suv.getAno());
        System.out.println("Volume do porta mala: " + suv.getVolumePortaMalas() + " Litros");


    }
}
