// Programação I 2021 - Aluno: Eduardo Mattar - RA: 1895103-5
package Menus;

import java.util.Scanner;

import InputDeUsuario.CadastroDeEntrada;
import InputDeUsuario.CadastroDeSaida;

public class MenuMovimentacao extends MenuGenerico{
    public Scanner sc = new Scanner(System.in);
 
    @Override
    public void Menu(){
        int opcao = 1;
        System.out.println("MENU MOVIMENTAÇÃO");
        System.out.println(ImprimirMenu());
        do{
            System.out.println();
            opcao = sc.nextInt();

            switch(opcao){
                case 1 : CadastroDeEntrada.inputDeMovimentacao();
                break;

                case 2 : CadastroDeSaida.inputDeMovimentacao();
                break;
                
            }
        }while(opcao != -1);

        System.out.println("Voltando ao Menu Principal");
    }

    @Override
    public String ImprimirMenu(){
        return   " 1 - DAR ENTRADA            "  + "\n" +
                 " 2 - DAR SAIDA              "  + "\n" +
                 "-1 - SAIR DO PROGRAMA       "  + "\n" +
                "OPÇÃO:";
    }
}
