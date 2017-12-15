package trabalhopoo;
import java.util.ArrayList;
public class Cliente extends Pessoa
{
    private ArrayList<Cliente> novoCliente;
    public Cliente(String nome, String cpf,String logra,int num,String bair,String cidade)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.logradouro=logra;
        this.estado=estado;
        this.numero=num;
        this.bairro=bair;
        this.cidade=cidade;
        
        
    }
    ArrayList compras=new ArrayList();
    public Cliente()
    {
        this.novoCliente = new ArrayList<Cliente>();
    }
    
    public void cadastrar(Cliente c)
    {
        this.novoCliente.add(c);
    }
    
}
