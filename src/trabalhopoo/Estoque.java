package trabalhopoo;

import java.util.ArrayList;

public class Estoque
{
    private static int cod=1;
    private Produto p1;
    private int quantidadeMinima;
    private boolean verifica;
    double caixa;
    ArrayList produtos = new ArrayList();
    ArrayList quantidades = new ArrayList();
    
    public boolean Saida(Produto p, int quantidade)
    {   
        int x=confere(p);
        Produto aux;
        if(x >= 0){
            aux=(Produto)produtos.get(x);
            if (aux.getQuantidade()<quantidade)
                return false;
            else{
                aux.setQuantidade(aux.getQuantidade()-quantidade);
                return true;
            
            } 
        }
            //Caso o estoque de determinado produto for menor ou igual 
            //a quantidade minima, serão comprados mais daquele produto
        else
            return false;   
    }
    public boolean Entrada(Produto p, int quantidade,double valor){
        
        int x= confere(p);
        double v;
        Produto aux = (Produto)produtos.get(x);
        System.out.println("preco "+aux.getPrecoDeVenda());
        v=(aux.getQuantidade()*aux.getPrecoDeVenda()+quantidade*valor)/(aux.getQuantidade()+quantidade);
        Entrada(p,quantidade);
        aux.setPrecoDeVenda(v);
        System.out.println("preco "+aux.getPrecoDeVenda());
        return true;
    }
    
    
    public boolean Entrada(Produto p, int quantidade)
    {   
        int x=confere(p);
        System.out.println(x+" "+produtos.size());
        Produto aux;
        
        if(x>=0){
            double v=0 ;
            aux=(Produto)produtos.get(x);
            aux.setQuantidade(aux.getQuantidade()+quantidade);
            if(aux.getPrecoDeVenda()!=p.getPrecoDeVenda()){
                
                v = atualizaPreco(p,quantidade);
                aux.setPrecoDeVenda(v);
            }
            System.out.println( "quantidade " +aux.getQuantidade()+" v "+v);
            return true;
        }
        else{
            p.setQuantidade(quantidade);
            p.setCodigo(cod);
            cod++;
            produtos.add(p);
            return true;
        }
    }
    public double atualizaPreco(Produto p,int quantidade){
        int x= confere(p);
        double v;
        Produto aux;
        aux=(Produto)produtos.get(x);
        v= (quantidade*p.getPrecoDeVenda()+aux.getQuantidade()*aux.getPrecoDeVenda())/(quantidade+aux.getQuantidade());
        System.out.println(p.getPrecoDeVenda()+" teste "+aux.getPrecoDeVenda());
        return v;
        
    }
    
    
    
    public int confere(Produto p){
        Produto aux;
        for(int i = 0;i<produtos.size();i++){
            aux=(Produto) produtos.get(i);
            if(aux.getNome().equals(p.getNome()))
                return i;
        }
        return -1;
    }
    
    public boolean isVerifica() {
        return verifica;
    }

    public void setVerifica(boolean verifica) {
        this.verifica = verifica;
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
    
    
    
    public boolean verificaEstoque(Produto p)
    {
        this.verifica = (p.getQuantidade()<=this.quantidadeMinima);        
        return true;
    }
    
    public String toString()
    {
        return "" + this.p1 + this.quantidadeMinima;
    }
    
    public void Entrada2(Produto p, int quantidadeAComprar)
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