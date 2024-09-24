package main.java;

public class CorpoHumano {

    //declaração de variaveis
    private int massa;
    private double volume;
    private int densidade;
    private double altura;

    //construtor vazio
    public CorpoHumano(){}
    
    //construtor com os todos os atributos
    public CorpoHumano(int massa, double volume, int densidade, double altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura=altura;
    }

    //getters e setters
    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getDensidade() {
        return densidade;
    }

    public void setDensidade(int densidade) {
        this.densidade = densidade;

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //metodo que calcula e retorna o imc
    public double calcularIMC(){
        return massa/(altura*altura);
    }

}
