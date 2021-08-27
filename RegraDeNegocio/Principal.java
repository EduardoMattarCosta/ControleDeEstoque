// Programação I 2021 - Aluno: Eduardo Mattar - RA: 1895103-5
package RegraDeNegocio;

import Menus.MenuPrincipal;

public class Principal{
    public  Estoque estoque = new Estoque();
    public static void main(String[] args){
        
        MenuPrincipal menu = new MenuPrincipal();
        menu.Menu();
        
    }
}