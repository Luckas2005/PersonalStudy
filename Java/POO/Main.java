public class Main {
    public static void main(String[] args) {
        
        Carro meuCarro = new Carro("Honda", "Civic");
        
        
        meuCarro.acelerar(20);
        
        meuCarro.ligar();
        meuCarro.acelerar(50);
        
        meuCarro.desligar();
        
        meuCarro.frear(60);
        meuCarro.desligar();
    }
}