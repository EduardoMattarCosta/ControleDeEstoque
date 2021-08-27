// Programação I 2021 - Aluno: Eduardo Mattar - RA: 1895103-5
package InputDeUsuario;

import java.util.Scanner;

import RegraDeNegocio.Movimentacao;

public class CadastroDeSaida {

    private static String descricao;
    private static int  quantidade;

    public static void inputDeMovimentacao(){
       Scanner sc = new Scanner(System.in);
       String opcao = "N";
        do{
            System.out.println("Digite a Descrição do produto que deseja dar baixa:");
            descricao = sc.nextLine();

            System.out.println("Qual a quantidade a ser baixada?");
            quantidade = sc.nextInt();

            sc.nextLine();
            System.out.println("Confirma a Saida de "+ quantidade + " " + descricao + ": S/N");
            opcao = sc.nextLine();
            
        }while(!opcao.toUpperCase().equals("S"));
        
        Movimentacao.saidaDeProduto(descricao, quantidade);
    }
}
