package trabalhopoo;
public class Produto 
{
    private String nome;
    private String fornecedor;
    private String marca;
    private double precoDeCusto;
    private double precoDeVenda;

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