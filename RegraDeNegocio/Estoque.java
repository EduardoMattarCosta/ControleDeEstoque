// Programação I 2021 - Aluno: Eduardo Mattar - RA: 1895103-5
package RegraDeNegocio;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    
    static List<Produto> Estoque = new ArrayList<Produto>();

    public static void AdicionarProduto(Produto produto){
        if(ProcurarProduto(produto) == -1){
            Estoque.add(produto);
        }
    }

    public static void ExcluirProduto(Produto produto){
        if(ProcurarProduto(produto) == 1){
            Estoque.remove(produto);
        }
    }

    public static void Saida(Produto produto, int quantidade){               
        for (Produto prod : Estoque) {
            if(prod.Equals(produto)){
                if(quantidade <= prod.getQuantidade()){                    
                    int quantAux = prod.getQuantidade();
                    quantAux = quantAux - quantidade;
                    prod.setQuantidade(quantAux);
                }
            }
        }
    }

    public static void Entrada(Produto produto, int quantidade){               
        for (Produto prod : Estoque) {
            if(prod.Equals(produto)){
                int quantAux = quantidade + prod.getQuantidade();
                prod.setQuantidade(quantAux);
                
            }
        }
    }

    public static int ProcurarProduto(Produto produto){
        for (Produto prod : Estoque) {
            if(produto.Equals(prod)){
                return 1;
            }
        }
        return -1;
    }
   
    public static void ImprimirEstoque(){
        for (Produto prod : Estoque) {
            System.out.println(prod.toString());
        }
    }

    public static double RetornarPreco(Produto produto){
        for (Produto prod : Estoque){
            if(prod.Equals(produto)){
               return prod.getPreco(); 
            }
        }
        return -1;
    }

    public static Produto RetornarProduto(Produto produto){
        for (Produto prod : Estoque) {
            if(produto.Equals(prod)){
                return prod;
            }
        }
        return null;
    } 
}
