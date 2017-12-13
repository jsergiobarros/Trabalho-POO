package trabalhopoo;
public class Estoque extends Produto
{
    private Produto p1;
    private int quantidadeMinima;
    private boolean verifica;

    public boolean isVerifica() {
        return verifica;
    }

    public void setVerifica(boolean verifica) {
        this.verifica = verifica;
    }

    public Estoque(String no, String forn, String marca, int quantidade, double pcusto,double pvenda)
    {
        super(no,forn,marca,quantidade,pcusto,pvenda);
    }
    
    public Estoque()
    {
        
    }
    
    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }
    

    public void setProduto ( Produto a)
    {
        this.p1 = a;
    }
    
    public Produto getProduto ()
    {
        return this.p1;
    }
    
    public void Saida(Produto p, int quantidadeMinima)
    {
        if(p.getQuantidade() <= quantidadeMinima)
        {
            System.out.println("A quantidade do produto" + p.getNome() + "está acabando!");
            //Caso o estoque de determinado produto for menor ou igual 
            //a quantidade minima, serão comprados mais daquele produto
            
        }
    }
    
    public boolean verificaEstoque(Produto p)
    {
        this.verifica = (p.getQuantidade()<=this.quantidadeMinima);        
        return true;
    }
    
    public void Entrada(Produto p, int quantidadeAComprar)
    {
        if(verificaEstoque(p) == true)
        {
            double a;
            System.out.println("Você está programando a compra de " + quantidadeAComprar + " unidades do produto " + p.getNome());          
            a = (quantidadeAComprar)*(p.getPrecoDeCusto());
            System.out.println("A compra dessas peças terá um custo de R$ " + a);      
        }
        else
            System.out.println("O estoque ainda está abastecido!");
    }
    
}