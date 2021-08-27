// Programação I 2021 - Aluno: Eduardo Mattar - RA: 1895103-5
package InputDeUsuario;

import java.util.Scanner;

import RegraDeNegocio.Estoque;
import RegraDeNegocio.Produto;
import RegraDeNegocio.Reajuste;

public class CadastroDeReajuste{
    public static void InputDeReajuste(){
        Scanner sc = new Scanner(System.in);
        String opcao = "N";
        String descricao;
        double valor;
        double valorASerAlterado;
        Produto produto;
        
        do{
            produto = new Produto();
            System.out.println("Digite a Descrição do produto que deseja Reajustar o Valor:");
            descricao = sc.nextLine();
            
            produto.setDescricao(descricao);
            
            System.out.println("Qual o novo valor de "  +produto.getDescricao()+ ":");
            valor = sc.nextInt(); 

            valorASerAlterado = Estoque.RetornarPreco(produto);
            if(valorASerAlterado == -1){
                break;
            }

            sc.nextLine();
            System.out.println("Valor Anterior de " +produto.getDescricao()+ ": " +valorASerAlterado );
            System.out.println("Valor Novo de " +produto.getDescricao()+ ": " + valor );
            System.out.println("Confirma a Alteração: S/N");
            opcao = sc.nextLine();
                
        }while(!opcao.toUpperCase().equals("S"));

        if(valorASerAlterado == -1){
            System.out.println("Não existe o produto em estoque, tente novamente!");
        }else{
            Reajuste.ReajustarProduto(produto,valor);   
        }
        System.out.println("Voltando ao Menu Principal.");
    }
}  


