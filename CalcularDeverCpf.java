package Aula13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalcularDeverCpf {
    static String calcularDv(String cpf) {
        int dv1 = 0;
        int dv2 = 0;
        int soma = 0;

        //Primeiro digito verificador DV
        for(int i = 0; i < cpf.length(); i++) {
            soma += ((10-i)* Integer.parseInt(cpf.substring(i,i+1)));
        }
        dv1 = (soma % 11);
        dv1 = 11 - dv1;
        if (dv1 >= 10) {
            dv1 = 0;
        }
        //Segundo DV
        cpf = cpf + dv1;
        soma = 0;
        for( int i =0; i < cpf.length(); i++) {
            soma += ((11 - i)*Integer.parseInt(cpf.substring(i,i+1)));
        }
        dv2 = 11 - (soma % 11);
        if(dv2 >= 10) {
            dv2 = 0;
        }
 
        //retorno
        return("" + dv1 + dv2);
    }
    public static void main(String []args) {
        //Declaração de variaveis
        BufferedReader leitor = new BufferedReader(  new InputStreamReader(System.in));
        String cpf = "";
        
        try {
            //Entrada de dados
            System.out.print("Digite o cpf sem o dv: ");
            cpf = leitor.readLine();
            //Saida de dados
            System.out.println(cpf + "-" + calcularDv(cpf));
        } catch (Exception erro) {
            System.out.println(erro);
        }
    }
}