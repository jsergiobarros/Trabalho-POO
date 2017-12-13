package trabalhopoo;
public class Produto 
{
    private String nome;
    private String fornecedor;
    private String marca;
    private int codigo;
    private int quantidade;
    private double precoDeCusto;
    private double precoDeVenda;

    
    public Produto(String no, String forn, String marca, int quantidade,double pcusto,double pvenda)
    {
        this.nome = no;
        this.fornecedor = forn;
        this.marca = marca;
        this.quantidade = quantidade;
        this.precoDeCusto = pcusto;
        this.precoDeVenda = pvenda;
    }
    
    public Produto()
    {
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getQuantidade() 
    {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) 
    {
        this.quantidade = quantidade;
    }
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getFornecedor() 
    {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) 
    {
        this.fornecedor = fornecedor;
    }

    public String getMarca() 
    {
        return marca;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public double getPrecoDeCusto() 
    {
        return precoDeCusto;
    }

    public void setPrecoDeCusto(double precoDeCusto) 
    {
        this.precoDeCusto = precoDeCusto;
    }

    public double getPrecoDeVenda() 
    {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(double precoDeVenda) 
    {
        this.precoDeVenda = precoDeVenda;
    }
        
}