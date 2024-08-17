import until.java.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        
        System.out.println("Discando");

        
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu ?" + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
