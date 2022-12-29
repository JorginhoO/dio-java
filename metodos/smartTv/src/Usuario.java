public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);   

        smartTv.aumentarCanal();
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);

        smartTv.diminuirVolume();
        System.out.println("Novo status -> Volume atual: " + smartTv.volume);

        smartTv.diminuirCanal();
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        
        System.out.println("Novo status -> Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(35);
        System.out.println("Novo status -> novo canal: " + smartTv.canal);
    
    }
}
