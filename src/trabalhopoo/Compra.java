package trabalhopoo;

import java.util.Scanner;

public class Compra 
{    
    private double valorAPagar;
    private double valorPago;
    
    public void setValorAPagar(double a)
    {
        this.valorAPagar = a;        
    }
    
    public void setValorPago(double a)
    {
        this.valorPago = a;
    }
    
    public double getValorAPagar()
    {
        return this.valorAPagar;
    }
    
    public double getValorPago()
    {
        return this.valorPago;
    }
    
    public double valorDaCompra(Produto ... objs)
    {
        if(objs.length > 0)
        {
            for(int i = 0; i <= objs.length; i++ )
            {
                this.valorAPagar = objs[i].getPrecoDeVenda() + this.valorAPagar;
            }
        }
        else
        {
            System.out.println("O cliente não escolheu nenhum produto");
        }
        System.out.println("O valor total dos produtos selecionados foi de R$ " + this.valorAPagar);
        return this.valorAPagar;
    }  
      
    public void TipoPagamento (double cash)
    {
        int especie= 1,cartao = 2;
        int operacao;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escolha cartao ou dinheiro [1 ou 2 ]: ");
        operacao = entrada.nextLine().charAt(0);
        
        switch( operacao )
        {
            case 1:
                double troco;
                //Compra c = new Compra();
                troco = this.valorAPagar - cash;
                System.out.println("troco");
                break;        
            case 2:
                break;   
            default:
                System.out.printf("Você digitou uma operação inválida.");        
        }
    }
}