package Carro.src;
class Car{
    int ano;
    String modelo;
    int potencia;
    String motor;
    String cor;
    int opcao;
    
    public Car (int ano, String modelo, int potencia, String motor, String cor, int opcao){
        this.ano = ano;
        this.modelo = modelo;
        this.potencia = potencia;
        this.motor = motor;
        this.cor = cor;
        this.opcao = opcao;
    }
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getPotencia(){
        return  potencia;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    public String getMotor(){
        return motor;
    }
    public void setMotor(String motor){
        this.motor = motor;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public int getOpcao(int opcao) {
    	return opcao;
    }
    public void setOpcao(int opcao) {
    	this.opcao = opcao;
    }  
    public String toString(){
        return "Ano: " + ano + " Modelo: " + modelo + " Potencia: " + potencia + " Motor: " + motor + " Cor: " + cor + opcao + "\n";
    }
 }