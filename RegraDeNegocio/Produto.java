package RegraDeNegocio;

import InputDeUsuario.CadastroDeProduto;

public class Produto{

    private String descricao;
    private double preco;
    private String unidade;
    private int quantidade;

    public Produto(){}

    public Produto(String descricao){
        this.descricao = descricao;
    }

    public Produto(String descricao, double preco, String unidade, int quantidade){
        this.descricao = descricao;
        this.preco = preco;
        this.unidade = unidade;
        this.quantidade = quantidade;
    }

    public static Produto criaProduto(){ 
        Produto novoProduto = CadastroDeProduto.inputDeCadastro();
        return novoProduto;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getUnidade() {
        return this.unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return descricao.equals(produto.descricao);
    }

    @Override
    public int hashCode() {
        return descricao.hashCode();
    }

    @Override
    public String toString(){
        return "Produto: "    + this.descricao   + " " +
               "Preco: "      + this.preco       + " " +
               "Unidade: "    + this.unidade     + " " +
               "Quantidade: " + this.quantidade  + " ";
    }
}