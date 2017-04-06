package br.edu.fatecfranca.exe3;
public class MeuString {
    public static void main(String args[]){
        //instancia o str1
        String str1 = "meu primeiro string";
        
        //imprime o tamanho do str1 usando metodo de instancia
        System.out.println("Comprimento de str1: " + str1.length());
        
        //imprime o elemento numero 2 do str1
        System.out.println("O elemento numero 2 da string é " + str1.charAt(2));
        
        //criar str2
        String str2 = String.valueOf(str1.length());
    }
}
