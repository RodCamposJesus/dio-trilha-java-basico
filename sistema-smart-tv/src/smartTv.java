public class smartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
        //System.out.println("Aumentando para o canal: " + canal);
        //canal = canal + 1;
    }

    public void diminuirCanal(){
        canal--;
        //System.out.println("Diminuindo para o canal: " + canal);
        //canal = canal - 1;
    }


    public void aumentarVolume(){
        canal++;
        System.out.println("Aumentando volume para: " + volume);
        //volume = volume + 1;
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
        //volume = volume - 1;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}
