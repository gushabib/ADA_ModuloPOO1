import java.util.ArrayList;
import java.util.List;

class NotaFiscal {

    private List<Produto> produtos = new ArrayList<Produto>();

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void removerProdutos(Produto produto){
        produtos.remove(produto);
    }

    public double calcularValorProduto(Produto produto){
        return produto.precoUnitario * produto.quantidade;
    }

    public double calcularValorNotaFiscal(){
        double valorNotaFiscal = 0.0;
        if(produtos.isEmpty()){
            return valorNotaFiscal;
        }else{
            for(int i = 0; i < produtos.size(); i++){
                valorNotaFiscal += produtos.get(i).precoUnitario * produtos.get(i).quantidade;
            }
        }
        return valorNotaFiscal;
    }
}
