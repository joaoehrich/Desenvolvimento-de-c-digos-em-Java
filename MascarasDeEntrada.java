package Aula13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MascarasDeEntrada {
static int lerNumeroInteiroDoTeclado() {
    BufferedReader leitor = new BufferedReader(
                            new InputStreamReader(System.in));
        int retorno = 0;
        boolean deuCerto = false;

        while (! deuCerto) {
            try {
                System.out.print("Digite um número inteiro: ");
                retorno = Integer.parseInt(leitor.readLine());
                deuCerto = true;
            } catch (Exception erro) {
                System.out.print("Vacilão, tenta de novo !!");
                deuCerto = false;
            }
        }
        return retorno;
    }
    static double lerNumeroFracionarioDoTeclado() {
        BufferedReader leitor = new BufferedReader(
                                new InputStreamReader(System.in));
            double retorno = 0;
            boolean deuCerto = false;
    
            while (! deuCerto) {
                try {
                    System.out.print("Digite um número fracionario: ");
                    retorno = Double.parseDouble(leitor.readLine());
                    deuCerto = true;
                } catch (Exception erro) {
                    System.out.print("Vacilão, tenta de novo !!");
                    deuCerto = false;
                }
            
            }
            return retorno;
        }
        static String lerTextoTamanhoFixo(int tamanho) {
            BufferedReader leitor = new BufferedReader(
                                    new InputStreamReader(System.in));
                String retorno = "";
                boolean deuCerto = false;

                while (! deuCerto) {
                    try {
                        System.out.print("Digite um texto de tamanho" + tamanho + ":");
                        retorno = leitor.readLine();
                        deuCerto = true;
                        if(retorno.length() != tamanho) {
                            throw new Exception();
                        }
                    }catch (Exception erro) {
                        System.out.println("não vacila cara");
                        deuCerto = false;
                    }
                }
                return retorno;
        }

        static String lerNumeroDeTelefone() {
            BufferedReader leitor = new BufferedReader(
                                    new InputStreamReader(System.in));
                String retorno = "";
                boolean deuCerto = false;

                while (! deuCerto) {
                    try {
                        System.out.print("Digite um numero de telefone:");
                        retorno = leitor.readLine();
                        deuCerto = true;
                        //
                        if(!retorno.substring(0,1).equals("(")) {
                            throw new Exception();
                        }
                        // numero inteiro posicao 1 e 2
                        Integer.parseInt(retorno.substring(1,3));
                        //posição 3 
                        if(!retorno.substring(3,4).equals(")")) {
                            throw new Exception();
                        }
                        //posição 4 e 8
                        Integer.parseInt(retorno.substring(4,9));
                        //posição 9
                        if (!retorno.substring(9,10).equals("-")) {
                       
                            throw new Exception();
                        }
                        //posição 10
                        Integer.parseInt(retorno.substring(10));
                        //maximo 14 caracteres
                        if (retorno.length() !=14) {
                            throw new Exception();
                        }
                    }catch (Exception erro) {
                        System.out.println("não vacila cara");
                        deuCerto = false;
                    }
                }
                return retorno;
        } 


    public static void main (String[] args) {
        //Declaração de variaveis
        int numero = 0;
        double fracionario =0;
        String texto = "";
        String telefone ="";

        //Entrada de dados
        numero = lerNumeroInteiroDoTeclado();
        fracionario = lerNumeroFracionarioDoTeclado();
        texto = lerTextoTamanhoFixo(6);
        telefone = lerNumeroDeTelefone();

        //Saida de dados
        System.out.println(numero);
        System.out.println(fracionario);
        System.out.println(texto);
        System.out.println(telefone);
    }
}