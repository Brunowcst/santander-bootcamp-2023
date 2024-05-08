package src.com.santanderbootcamp.bruno.metodos;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 50;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume ++;
    }

    public void diminuirVolume() {
        volume --;
    }

    public void mudarCanal(int numCanal) {
        canal = numCanal;
    }

    public void diminuirCanal() {
        canal --;
    }

    public void subirCanal() {
        volume ++;
    }
}


