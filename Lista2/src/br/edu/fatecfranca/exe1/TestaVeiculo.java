package br.edu.fatecfranca.exe1;
import javax.swing.JOptionPane;
public class TestaVeiculo {
    public static void main(String args[]){
        //instanciação dos objetos
        //Carro
        Veiculo carro = new Veiculo();
        carro.tipo = JOptionPane.showInputDialog("Qual o tipo do carro?");
        carro.nroRodas = Integer.parseInt(JOptionPane.showInputDialog("Qual o número de rodas do carro?"));
        carro.cor = JOptionPane.showInputDialog("Qual a cor do carro?");
        carro.ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano do carro?"));
        //Moto
        String no = JOptionPane.showInputDialog("Qual o tipo da moto?");
        int nr = Integer.parseInt(JOptionPane.showInputDialog("Qual o número de rodas da moto?"));
        String co = JOptionPane.showInputDialog("Qual a cor da moto?");
        int an = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano da moto?"));
        Veiculo moto = new Veiculo(no, nr, co, an);
        //dono do carro e da moto
        Veiculo.nomeDono = JOptionPane.showInputDialog("Qual o nome do dono do carro e da moto?");
        //Impressão com o metodo mostra()
        JOptionPane.showMessageDialog(null, carro.mostra());
        JOptionPane.showMessageDialog(null, moto.mostra());
        //Alterar as informações do objeto moto
        moto.alteraTipo(JOptionPane.showInputDialog("Qual o novo tipo da moto?"));
        moto.alteraNroRodas(Integer.parseInt(JOptionPane.showInputDialog("Qual o novo número de rodas da moto?")));
        moto.alteraCor(JOptionPane.showInputDialog("Qual a nova cor da moto?"));
        moto.alteraAno(Integer.parseInt(JOptionPane.showInputDialog("Qual o novo ano da moto?")));
        Veiculo.alteraNome(JOptionPane.showInputDialog("Qual o nome do novo dono da moto?"));
        //Impressão novamente com o metodo mostra()
        JOptionPane.showMessageDialog(null, carro.mostra());
        JOptionPane.showMessageDialog(null, moto.mostra());
        //metodo parImpar
        JOptionPane.showMessageDialog(null, "O numero de rodas é " + Veiculo.parImpar(Integer.parseInt(JOptionPane.showInputDialog("Qual o número de rodas?"))));
        //metodo retornaNovoVeiculo
        Veiculo novo = Veiculo.retornaNovoVeiculo(carro, moto);
        JOptionPane.showMessageDialog(null, novo.mostra());
    }
}
