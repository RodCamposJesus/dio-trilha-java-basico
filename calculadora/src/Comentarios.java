public class Comentarios {
    public static void main(String[] args) {
        //Olá eu sou um comentário em uma única linha
         
        /* Olá
          * Eu sou umcomentário
          * que posso ser mais detalhado
          * quando necessário
          */
          /**
           * Estas duas estrelinhas
           * é para identificar que você
           * pretende elaborar um  comentário
           * em forma de documentação
           */
          public void metodo(){

          }

          /*
           * Este método foi elaborado as pressas
           * por isso  eu abreviei  o nome das variáveis
           * mas olha,  ele tem a finalidade  somar ou multiplicar
           * dois números
           */
          public int somaMultiplica(int n, int x, String m){
            int r = 0; //r é igual ao resultado
            if(m == "M"){ //M = multiplicação
                r = n * x;
            }else {
                // se nao soma mesmo
                r = n + x;
            }
            return r;

    }

}
