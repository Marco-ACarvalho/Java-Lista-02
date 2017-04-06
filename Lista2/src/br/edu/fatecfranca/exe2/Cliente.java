package br.edu.fatecfranca.exe2;
public class Cliente {
    //declarações das variaveis
    public String numeroConta;
    public String numeroAgencia;
    public String nome;
    public static float saldo;
    //metodos construtores
    public Cliente(){
        this.numeroConta = "";
        this.numeroAgencia = "";
        this.nome = "";
    }
    public Cliente(String nC, String nA, String no){
        this.numeroConta = nC;
        this.numeroAgencia = nA;
        this.nome = no;
    }
    //metodos de instancia de realizar deposito e saque
    public void realizarDeposito(float val){
        Cliente.saldo += val;
    }
    public void realizarSaque(float val){
        Cliente.saldo -= val;
    }
    //metodo de instancia para impressão
    public String imprimir(){
        return "O número da conta é " + this.numeroConta +
                "\nO número da agencia é " + this.numeroAgencia +
                "\nO nome do cliente é " + this.nome +
                "\nO saldo do cliente é " + Cliente.saldo;
    }
    //Metodo de classe que altera e metodo que retorna o saldo atual
    public static void alteraSaldo(float newSaldo){
        Cliente.saldo = newSaldo;
    }
    public static float retornaSaldo(){
        return Cliente.saldo;
    }
    //metodo que altera e metodo que retorna a agencia
    public void alteraNAgencia(String newNA){
        this.numeroAgencia = newNA;
    }
    public String retornaNAgencia(){
        return this.numeroAgencia;
    }
    //metodo que cria um novo cliente
    public static Cliente retornaNovoCliente(Cliente cliente1, Cliente cliente2){
        Cliente.saldo *= 2;
        Cliente newCliente = new Cliente(cliente2.numeroConta, cliente1.numeroAgencia, "Fulano");
        return newCliente;
    }
    //metodo de verificar tamanho
    public static String verificaTamanho(String nA){
        if (nA.length() == 6){
            return "tem";
        }
        else return "nao tem";
    }
}