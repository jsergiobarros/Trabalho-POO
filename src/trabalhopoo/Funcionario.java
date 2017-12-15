package trabalhopoo;
public class Funcionario extends Pessoa
{
        private String pis;
        private double totalEmVendas;
        public Funcionario(String nome, String cpf,String logra,int num,String bair,String cidade)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.logradouro=logra;
        this.estado=estado;
        this.numero=num;
        this.bairro=bair;
        this.cidade=cidade;
        
        
    }
        
        
        
        public void setPis(String p)
        {
            this.pis = p;
        }
        
        public void setTotalEmVendas(double x)
        {
            this.totalEmVendas = x;
        }
        
        public String getPis()
        {
            return this.pis;
        }
        
        public double getTotalEmVendas()
        {
            return this.totalEmVendas;
        }
        
        public void venda()
        {
            
        }
}
