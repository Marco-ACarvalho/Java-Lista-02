package br.edu.fatecfranca.exe4;
public class Computador {
    //variaveis
    public String processador;
    public static int ram;
    //metodos construtores
    public Computador(){
        this.processador = "";
    }
    public Computador(String pro){
        this.processador = pro;
    }
    //metodo para alterar o valor do processador
    public void alteraProcessador(String novoProcessador){
        this.processador = novoProcessador;
    }
    public static void alteraRam(int novoRam){
        Computador.ram = novoRam;
    }
    public static void upgrade(){
        Computador.ram += 256;
    }
    public String mostra(){
        return "Processador atual: " + this.processador +
                "\nRam atual: " + Computador.ram + " MB";
    }
}
