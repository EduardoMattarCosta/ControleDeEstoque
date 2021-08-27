// Programação I 2021 - Aluno: Eduardo Mattar - RA: 1895103-5
package RegraDeNegocio;

public class Relatorio {
    public void GerarRelatorio(){
        if(Estoque.Estoque.isEmpty()){
           System.out.println("Estoque vazio!");
        }else{
            Estoque.ImprimirEstoque();
       }
   }
}
