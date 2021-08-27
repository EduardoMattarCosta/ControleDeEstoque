// Programação I 2021 - Aluno: Eduardo Mattar - RA: 1895103-5
package RegraDeNegocio;

public class Reajuste {
    public static void ReajustarProduto(Produto produto, double valorReajuste){
        Produto produtoASerAlterado = Estoque.RetornarProduto(produto);

        produtoASerAlterado.setPreco(valorReajuste);
        System.out.println("Valor Reajustado");
    }
}
