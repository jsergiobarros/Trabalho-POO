package trabalhopoo;
public class Cliente extends Pessoa
{
    public Cliente(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
        System.out.println("Nome: " + this.nome + "| CPF: " + this.cpf);
    }
    
}
