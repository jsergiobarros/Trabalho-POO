package trabalhopoo;

import java.util.Scanner;

public class Compra 
{    
    private double valorAPagar;
    private double valorPago;
    
    public double getValorAPagar()
    {
        Produto p1 = new Produto();
        return this.valorAPagar = p1.getPrecoDeVenda();
    }
    
    public double getValorPago()
    {
        return this.valorPago;
    }
    
    public double valorDaCompra(Produto ... objs)
    {
        Compra c1 = new Compra();
        if(objs.length > 0)
        {
            for(int i = 0; i <= objs.length; i++ )
            {
                //c1.getValorAPagar() = c1.getValorAPagar() + objs[i].getPrecoDeVenda();
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