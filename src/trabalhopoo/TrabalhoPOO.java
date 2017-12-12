package trabalhopoo;
public class TrabalhoPOO {
    public static void main(String[] args) 
    {
        Estoque p1 = new Estoque("Sabonete","Dove","Unilever", 50,1.5,2.0);
        System.out.println(p1.getNome()+" |"+p1.getMarca()+" |"+p1.getFornecedor()+" |"+p1.getQuantidade());
        p1.setPrecoDeVenda(2.5);
        p1.comprarEstoque(p1, 25);
        Compra c1 = new Compra();
        c1.adicionarProduto(p1);
        c1.valorproduto(p1);
        c1.valorDaCompra();
        c1.Pagamento(1);
    }
}