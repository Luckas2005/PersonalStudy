// Melhorando os entrendimentos de POO.
public class Carro {
    
    // 1. Encapsulamento: O estado do carro é privado
    private String marca;
    private String modelo;
    private boolean ligado;
    private int velocidadeAtual;

    // 2. Construtor: Como o carro sai da fábrica/concessionária
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        // Definimos o estado inicial padrão:
        this.ligado = false;
        this.velocidadeAtual = 0; 
    }

    // 3. Getters: Permitem ver o painel do carro (leitura)
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }


    public void ligar() {
        if (!ligado) {
            this.ligado = true;
            System.out.println("O " + modelo + " foi ligado. Vrum!");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (velocidadeAtual == 0) {
            this.ligado = false;
            System.out.println("O " + modelo + " foi desligado.");
        } else {
            System.out.println("Aviso: Pare o carro antes de desligar o motor!");
        }
    }

    public void acelerar(int incremento) {
        if (ligado) {
            this.velocidadeAtual += incremento;
            System.out.println("Acelerando... Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Erro: Não é possível acelerar com o carro desligado.");
        }
    }

    public void frear(int decremento) {
        if (velocidadeAtual - decremento >= 0) {
            this.velocidadeAtual -= decremento;
            System.out.println("Freando... Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            this.velocidadeAtual = 0;
            System.out.println("O carro parou totalmente.");
        }
    }
}