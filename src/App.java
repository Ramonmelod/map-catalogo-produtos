public class App {
    public static void main(String[] args) throws Exception {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.AdicionarProduto(651445485L, "camera", 25.5, 25);
        estoqueProdutos.AdicionarProduto(651445485L, "alicate", 12.25, 250);
        estoqueProdutos.AdicionarProduto(155654L, "valvula", 45.5, 12);
        estoqueProdutos.AdicionarProduto(568712L, "colher", 1.5, 5);
        estoqueProdutos.ExibirProdutos();

    }
}
