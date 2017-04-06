package br.edu.fatecfranca.exe1;
public class Veiculo {
    //Vaiáveis
    public String tipo;
    public int nroRodas;
    public String cor;
    public int ano;
    public static String nomeDono;
    //Metodos construtores
    public Veiculo(){
        this.tipo = "";
        this.nroRodas = 0;
        this.cor = "";
        this.ano = 0;
    }
    public Veiculo(String ti, int nr, String co, int an){
        this.tipo = ti;
        this.nroRodas = nr;
        this.cor = co;
        this.ano = an;
    }
    //metodos de instancia
    public void alteraTipo(String newTipo){
        this.tipo = newTipo;
    }
    public void alteraNroRodas(int newNroRodas){
        this.nroRodas = newNroRodas;
    }
    public void alteraCor(String newCor){
        this.cor = newCor;
    }
    public void alteraAno(int newAno){
        this.ano = newAno;
    }
    public String mostra(){
        return "Tipo: " + this.tipo +
                "\nNúmero de rodas: " + this.nroRodas +
                "\nCor: " + this.cor +
                "\nAno: " + this.ano +
                "\nNome do dono: " + Veiculo.nomeDono;
    }
    //metodos de classe
    public static void alteraNome(String newNome){
        Veiculo.nomeDono = newNome;
    }
    public static String retornaNome(){
        return Veiculo.nomeDono;
    }
    public static String parImpar(int nro){
        if((nro%2) == 0){
            return "par";
        }
        else return "impar";
    }
    public static Veiculo retornaNovoVeiculo(Veiculo vei1, Veiculo vei2){
        int anoMaior;
        if(vei1.ano >= vei2.ano){
            anoMaior = vei1.ano; 
        }
        else anoMaior = vei2.ano;
        Veiculo newVei = new Veiculo(vei1.tipo, (vei1.nroRodas + vei2.nroRodas), vei2.cor, anoMaior);
        return newVei;
    }
}
