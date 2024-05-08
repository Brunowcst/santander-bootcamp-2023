package src.com.santanderbootcamp.bruno.metodos;

public class usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("Ligada:" + smartTv.ligada);
        System.out.println("Canal:" + smartTv.canal);
        System.out.println("Volume:" + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(5);
        System.out.println("Ligada:" + smartTv.ligada);
        System.out.println("Canal:" + smartTv.canal);
        System.out.println("Volume:" + smartTv.volume);

        smartTv.desligar();
        System.out.println("Ligada:" + smartTv.ligada);
    }
}
