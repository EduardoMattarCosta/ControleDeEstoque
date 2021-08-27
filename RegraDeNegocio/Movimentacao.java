// Programação I 2021 - Aluno: Eduardo Mattar - RA: 1895103-5
package RegraDeNegocio;

public class Movimentacao {
    
    public static void saidaDeProduto(String descricao, int quantidade){
        
        Produto produtoAux = new Produto(descricao);
        int existe = Estoque.ProcurarProduto(produtoAux);

        if(existe == -1){
            System.out.println("O produto que deseja dar saida não existe em estoque! Verifique!");
        }else{
            Estoque.Saida(produtoAux, quantidade);      
        }
    }
    public static void EntradaDeProduto(String descricao, int quantidade){
        
        Produto produtoAux = new Produto(descricao);
        int existe = Estoque.ProcurarProduto(produtoAux);

        if(existe == -1){
            System.out.println("O produto que deseja dar Entrada não existe em estoque! Verifique!");
        }else{
            Estoque.Entrada(produtoAux, quantidade);      
        }
    }
}
