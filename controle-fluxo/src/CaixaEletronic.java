public class CaixaEletronic {
    
    public static void main(String[] args) throws Exception {
        
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo Saldo " + saldo);
        }else
            System.out.println("Saldo insuficiente");
        
    }
}

