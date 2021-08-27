// Programação I 2021 - Aluno: Eduardo Mattar - RA: 1895103-5
package RegraDeNegocio;

import InputDeUsuario.CadastroDeProduto;

public class Produto{
    
    //Getters e Setters
    //#region

   
    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public String getUnidade() {
        return Unidade;
    }

    public void setUnidade(String unidade) {
        Unidade = unidade;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }
    //#endregion
    
    private String Descricao;
    private double Preco;
    private String Unidade;
    private int  Quantidade;

    public Produto(){}

    public Produto(String descricao){
        Descricao = descricao;
    }

    public Produto(String descricao, double preco, String unidade, int quantidade){
        Descricao = descricao;
        Preco = preco;
        Unidade = unidade;
        Quantidade = quantidade;
    }

    public static Produto criaProduto(){ 
        //Chama a tela de cadastro
        Produto novoProduto = CadastroDeProduto.inputDeCadastro();
        return novoProduto;
    }

    public Boolean Equals(Produto produto){
        if(this.getDescricao().equals(produto.getDescricao())){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "Produto: "    + Descricao   + " " +
               "Preco: "      + Preco       + " " +
               "Unidade: "    + Unidade     + " " +
               "Quantidade: " + Quantidade  + " ";
    }
}