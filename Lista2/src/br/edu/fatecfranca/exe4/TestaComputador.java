package br.edu.fatecfranca.exe4;

import javax.swing.JOptionPane;

public class TestaComputador {
    public static void main(String args[]){
        //criar um objeto
        Computador pc = new Computador();
        
        //instanciação do objeto
        pc.processador = JOptionPane.showInputDialog("Informe qual o processador:");
        Computador.ram = Integer.parseInt(JOptionPane.showInputDialog("Quantos MB tem a memoria RAM?"));
        
        //chamada dos metodos
        pc.alteraProcessador(JOptionPane.showInputDialog("Informe qual o novo processador:"));
        Computador.alteraRam(Integer.parseInt(JOptionPane.showInputDialog("Qual o novo valor da ram?")));
        Computador.upgrade();
        Computador.upgrade();
        //mostrar os resultados alterados para confirmação
        JOptionPane.showMessageDialog(null, pc.mostra());
    }
}
