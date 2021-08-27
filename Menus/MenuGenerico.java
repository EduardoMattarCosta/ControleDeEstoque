// Programação I 2021 - Aluno: Eduardo Mattar - RA: 1895103-5
package Menus;
import java.util.Scanner;

abstract class MenuGenerico{
    Scanner sc = new Scanner(System.in);

    void Menu(){
      
        int opcao = 1;

        do{
            System.out.println();
            opcao = sc.nextInt();

            switch(opcao){
                case 1 :
                break;

                case 2:
                break;
            }

        }while(opcao != -1);

        System.out.println("Saindo do Sistema");
    }

    public String ImprimirMenu(){
        return "";
    }
}