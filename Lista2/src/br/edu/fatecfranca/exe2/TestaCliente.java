package br.edu.fatecfranca.exe2;
import javax.swing.JOptionPane;
public class TestaCliente {
    public static void main(String args[]){
        //Cria um novo cliente Fulano
        Cliente fulano = new Cliente();
        //instancia o objeto
        fulano.numeroConta = JOptionPane.showInputDialog("Informe o numero da conta do fulano:");
        fulano.numeroAgencia = JOptionPane.showInputDialog("Informe o numero da agencia da conta do fulano:");
        fulano.nome = JOptionPane.showInputDialog("Informe o nome do fulano:");
        fulano.saldo = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo inicial do fulano:"));
        //Cliente.saldo = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo inicial do fulano:"));
        //chamar metodos realizarDeposito e realizarSaque
        fulano.realizarDeposito(Float.parseFloat(JOptionPane.showInputDialog("Fulano! Deseja fazer o deposito de quanto?")));
        fulano.realizarSaque(Float.parseFloat(JOptionPane.showInputDialog("Fulano! Deseja fazer o saque de quanto?")));
        //mostra as informações atuais do fulano
        JOptionPane.showMessageDialog(null, fulano.imprimir());
        
        //parte do cliente Beltrano
        String nC = JOptionPane.showInputDialog("Informe o numero da conta do Beltrano:");
        String nA = JOptionPane.showInputDialog("Informe o numero da agencia da conta do Beltrano:");
        String no = JOptionPane.showInputDialog("Informe o nome do Beltrano:");
        Cliente beltrano = new Cliente(nC, nA, no);
        //chamar metodos realizarDeposito e realizarSaque no beltrano
        beltrano.realizarDeposito(Float.parseFloat(JOptionPane.showInputDialog("Beltrano! Deseja fazer o deposito de quanto?")));
        beltrano.realizarSaque(Float.parseFloat(JOptionPane.showInputDialog("Beltrano! Deseja fazer o saque de quanto?")));
        //mostra as informações atuais do fulano
        JOptionPane.showMessageDialog(null, beltrano.imprimir());
        
        //Usando o metodo retornaNovoCliente
        Cliente novoCliente = Cliente.retornaNovoCliente(fulano, beltrano);
        //mostra as informações atuais do novo cliene
        JOptionPane.showMessageDialog(null, novoCliente.imprimir());
        
        //usando o metodo verifica tamanho
        nA = JOptionPane.showInputDialog("Informe o numero da agencia que deseja verificar tamanho:");
        JOptionPane.showMessageDialog(null, "O numero da agencia informado " + Cliente.verificaTamanho(nA) + " tamanho 6.");
    }
}
