import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();

    }

    public void AdicionarProduto(Long codigo, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

}
