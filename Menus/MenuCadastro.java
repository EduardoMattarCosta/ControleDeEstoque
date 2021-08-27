// Programação I 2021 - Aluno: Eduardo Mattar - RA: 1895103-5
package Menus;

import RegraDeNegocio.Estoque;
import RegraDeNegocio.Produto;
import java.util.Scanner;

public class MenuCadastro extends MenuGenerico{
    public Scanner sc = new Scanner(System.in);

    @Override
    public void Menu(){
        String opcao = "S";

        System.out.println("CADASTRO DE ITEM");
        while(true){
            Produto novoproduto = Produto.criaProduto();
            Estoque.AdicionarProduto(novoproduto);

            System.out.println("Deseja cadastrar mais um produto? S/N");
            opcao = sc.nextLine();

            if(opcao.toUpperCase().equals("N")){
                break;
            }
        }

        System.out.println("Voltando ao Menu Principal.");
    }
}
