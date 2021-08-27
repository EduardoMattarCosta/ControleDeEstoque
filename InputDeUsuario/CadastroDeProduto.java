// Programação I 2021 - Aluno: Eduardo Mattar - RA: 1895103-5
package InputDeUsuario;

import java.util.Scanner;

import RegraDeNegocio.Produto;

public class CadastroDeProduto{
    static Scanner sc = new Scanner(System.in);

    private static String descricao;
    private static double preco;
    private static String unidade;
    private static int  quantidade;
    
    public static Produto inputDeCadastro(){
       String opcao = "N";
       Produto novoProduto; 
       do{
            
            System.out.println("Digite o Nome do Produto:");
            descricao = sc.nextLine();

            sc.nextLine();

            System.out.println("Digite o Preço do Produto:");
            preco = sc.nextDouble();

            sc.nextLine();

            System.out.println("Digite a Unidade do Produto:");
            unidade = sc.nextLine();

            sc.nextLine();

            System.out.println("Digite a Quantidade do Produto:");
            quantidade = sc.nextInt();

            sc.nextLine();

            novoProduto = new Produto(descricao, preco, unidade, quantidade);

            System.out.println(novoProduto.toString());

            System.out.println("Confirma os dados: S/N");
            opcao = sc.nextLine();

       }while(!opcao.toUpperCase().equals("S"));

       return novoProduto;
    }
}