package br.com.brunopereira.view;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void status(){
        System.out.print("Modelo: "+ this.modelo);
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
                
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar");
        }else {
            System.out.println("Estou Rabiscando");
        }
    }
    protected void tamparda(){
        this.tampada = true;
    }
    
    protected void destampar(){
        this.tampada = false;
    }
            
}
