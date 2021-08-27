// Programação I 2021 - Aluno: Eduardo Mattar - RA: 1895103-5
package Menus;

import java.util.Scanner;

import InputDeUsuario.CadastroDeReajuste;

public class MenuReajustePreco extends MenuGenerico{
    public Scanner sc = new Scanner(System.in);
 
    @Override
    public void Menu(){
        String opcao = "N";
        System.out.println("MENU REAJUSTE DE PREÇO");
        System.out.println("");
        do{
            CadastroDeReajuste.InputDeReajuste();

            System.out.println("Deseja Alterar Outro Produto? S/N");
            opcao = sc.nextLine();

        }while(!opcao.toUpperCase().equals("N"));

        System.out.println("Voltando ao Menu Principal");
    }  
}