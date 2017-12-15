package trabalhopoo;
public class TrabalhoPOO {
    public static void main(String[] args) 
    {
        Produto p1 = new Produto("Sabonete","Dove","Unilever", 50,1.5,2.0);
        Produto p2 = new Produto("suco","vale","Unilever", 50,1.5,2.0);
        Estoque e1 = new Estoque();
        System.out.println(p1.getCodigo()+" "+p2.getCodigo());
        
        e1.Entrada(p1, 500);
        p2 = (Produto)e1.produtos.get(0);
        System.out.println(p2.getPrecoDeVenda()+" "+p2.getQuantidade());
       
        e1.Entrada(p1, 500,3);
        e1.Saida(p1, 300);
        e1.Entrada(p1, 500,4);
        System.out.println(p2.getPrecoDeVenda()+" atualização "+p2.getQuantidade());
        e1.Entrada(p1, 500);
        e1.Entrada(p1, 500);
        p2 = (Produto)e1.produtos.get(0);
        System.out.println(p2.getPrecoDeVenda() +"x  "+ p1.getNome()+" |"+p1.getMarca()+" |"+p1.getFornecedor()+" |"+p1.getQuantidade());
        p1.setPrecoDeVenda(2.5);
      //  p1.Entrada(p1, 25);
        Compra c1 = new Compra();
        c1.adicionarProduto(p1);
        c1.valorproduto(p1);
        c1.valorDaCompra();
        c1.Pagamento(1);
    }
}