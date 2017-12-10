package trabalhopoo;
public class Estoque extends Produto
{
    private Produto p1;
    
    public Estoque(String no, String forn, String marca, int quantidade, double pcusto,double pvenda)
    {
        super(no,forn,marca,quantidade,pcusto,pvenda);
    }

    public void setProduto ( Produto a)
    {
        this.p1 = a;
    }
    
    public Produto getProduto ()
    {
        return this.p1;
    }
    
    public void gerenciarEstoque(Produto p, int quantidadeMinima)
    {
        if(p.getQuantidade() <= quantidadeMinima)
        {
            //Caso o estoque de determinado produto for menor ou igual 
            //a quantidade minima, serão comprados mais daquele produto
            System.out.println("A quantidade do produto" + p.getNome() + "está acabando!");
        }
    }
    
    public void comprarEstoque(Produto p, int quantidadeAComprar)
    {
        System.out.println("Você está programando a compra de " + quantidadeAComprar + " unidades do produto " + p.getNome());
        double a;
        a = (quantidadeAComprar)*(p.getPrecoDeCusto());
        System.out.println("A compra dessas peças terá um custo de R$ " + a);
    }
    
}