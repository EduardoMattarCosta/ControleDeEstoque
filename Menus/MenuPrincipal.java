// Programação I 2021 - Aluno: Eduardo Mattar - RA: 1895103-5
package Menus;
import java.util.Scanner;

public class MenuPrincipal extends MenuGenerico{
    public Scanner sc = new Scanner(System.in);
    public MenuCadastro menuCadastro  = new MenuCadastro();
    public MenuMovimentacao menuMovimentacao = new MenuMovimentacao();
    public MenuReajustePreco menuReajustePreco = new MenuReajustePreco();
    public MenuRelatorio menuRelatorio = new MenuRelatorio();
 
    @Override
    public void Menu(){
        int opcao = 1;
        System.out.println("BEM VINDO AO SISTEMA DE GESTÃO DE ESTOQUE! \n\n Digite \n\n");
        do{
            System.out.println(ImprimirMenu());
            opcao = sc.nextInt();

            switch(opcao){
                case 1 : menuCadastro.Menu();
                break;

                case 2 : menuMovimentacao.Menu();
                break;
                
                case 3: menuReajustePreco.Menu();
                break;

                case 4: menuRelatorio.Menu();
                break;
            }
        }while(opcao != -1);

        System.out.println("Saindo do Sistema");
 
    }

    @Override
    public String ImprimirMenu(){
        return   " 1 - CADASTRAR NOVO PRODUTO "  + "\n" +
                 " 2 - MOVIMENTAÇÃO DE PRODUTOS" + "\n" +
                 " 3 - REAJUSTE DE PREÇO"        + "\n" +
                 " 4 - IMPRIMIR ESTOQUE"        + "\n" +
                 "-1 - SAIR DO PROGRAMA"         + "\n" +
                "OPÇÃO:";
    }
}
