// Programação I 2021 - Aluno: Eduardo Mattar - RA: 1895103-5
package Menus;

import java.util.Scanner;

import RegraDeNegocio.Relatorio;

public class MenuRelatorio extends MenuGenerico{
    public Scanner sc = new Scanner(System.in);
    Relatorio relatorio = new Relatorio();
 
    @Override
    public void Menu(){
        relatorio.GerarRelatorio();
        System.out.println("Voltando ao Menu Principal");
    }  
}
