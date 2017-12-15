package trabalhopoo;
import java.util.Scanner;
public class Acompanhamento extends javax.swing.JFrame 
{
    public Acompanhamento() {
        initComponents();
    }
    AreaDeUsuario anterior;
     public Acompanhamento(AreaDeUsuario anterior) {
        initComponents();
        this.anterior=anterior;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonVendas = new javax.swing.JButton();
        jButtonEstoque = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonCliente = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCPF = new javax.swing.JTextField();
        jTextFieldLogra = new javax.swing.JTextField();
        jTextFieldNum = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelLogra = new javax.swing.JLabel();
        jLabelNum = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acompanhamento");
        getContentPane().setLayout(null);

        jButtonSair.setText("SAIR");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(507, 400, 70, 23);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("CONTROLE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 20, 97, 22);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhopoo/pooo.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 122, 55);

        jButtonVendas.setText("VENDAS");
        jButtonVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVendas);
        jButtonVendas.setBounds(30, 110, 90, 23);

        jButtonEstoque.setText("ESTOQUE");
        jButtonEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEstoque);
        jButtonEstoque.setBounds(30, 150, 90, 23);

        jButtonVoltar.setText("VOLTAR");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(40, 400, 100, 23);

        jButtonCliente.setText("CLIENTE");
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCliente);
        jButtonCliente.setBounds(30, 190, 90, 23);

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(290, 70, 220, 20);
        jTextFieldNome.setVisible(false);
        getContentPane().add(jTextFieldCPF);
        jTextFieldCPF.setBounds(290, 100, 220, 20);
        jTextFieldCPF.setVisible(false);

        jTextFieldLogra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLograActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldLogra);
        jTextFieldLogra.setBounds(290, 130, 220, 20);
        jTextFieldLogra.setVisible(false);
        getContentPane().add(jTextFieldNum);
        jTextFieldNum.setBounds(290, 160, 220, 20);
        jTextFieldNum.setVisible(false);

        jTextFieldBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBairro);
        jTextFieldBairro.setBounds(290, 190, 220, 20);
        jTextFieldBairro.setVisible(false);

        jTextFieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCidade);
        jTextFieldCidade.setBounds(290, 220, 220, 20);
        jTextFieldCidade.setVisible(false);

        jLabelNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNome.setText("Nome");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(200, 70, 50, 20);
        jLabelNome.setVisible(false);

        jLabelCPF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCPF.setText("CPF");
        getContentPane().add(jLabelCPF);
        jLabelCPF.setBounds(200, 95, 50, 30);
        jLabelCPF.setVisible(false);

        jLabelLogra.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelLogra.setText("Logradouro");
        getContentPane().add(jLabelLogra);
        jLabelLogra.setBounds(200, 130, 80, 20);
        jLabelLogra.setVisible(false);

        jLabelNum.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNum.setText("Numero");
        getContentPane().add(jLabelNum);
        jLabelNum.setBounds(200, 160, 45, 20);
        jLabelNum.setVisible(false);

        jLabelBairro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelBairro.setText("Bairro");
        getContentPane().add(jLabelBairro);
        jLabelBairro.setBounds(200, 190, 60, 15);
        jLabelBairro.setVisible(false);

        jLabelCidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCidade.setText("Cidade");
        getContentPane().add(jLabelCidade);
        jLabelCidade.setBounds(200, 220, 70, 15);
        jLabelCidade.setVisible(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhopoo/fundo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 450);

        setSize(new java.awt.Dimension(615, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVendasActionPerformed

    private void jButtonEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstoqueActionPerformed
        Estoque es = new Estoque();
        Produto p = new Produto();
        Scanner s = new Scanner(System.in);
        //String str = jTextAreaControle.getText(); /* Vai pegar tudo até a primeira quebra de linha. Garanta que o número é válido!*/
        int i = 0;
        try 
        {
         //   i = Integer.parseInt(str); // Caso você queira tipo int, que é o usual.
        } 
        catch (NumberFormatException e) 
        {
           System.out.println("Numero com formato errado!");
        }
        finally 
        {
           s.close(); //fechar o Scanner para gerenciar melhor a memória.
        }
        es.Entrada(p,i);
        tu += "" + p + "" + i + "\n";
    }//GEN-LAST:event_jButtonEstoqueActionPerformed
    String tu;
    
    public void status(boolean a)
    {
        jLabelNome.setVisible(a);
        jLabelCPF.setVisible(a);
        jLabelLogra.setVisible(a);
        jLabelNum.setVisible(a);
        jLabelBairro.setVisible(a);
        jLabelCidade.setVisible(a);
        jTextFieldNome.setVisible(a);
        jTextFieldCPF.setVisible(a);
        jTextFieldLogra.setVisible(a);
        jTextFieldNum.setVisible(a);
        jTextFieldBairro.setVisible(a);
        jTextFieldCidade.setVisible(a);
    }
    
   public void nomeLabelCliente()
   {
       jLabelNome.setText("Nome");
       jLabelCPF.setText("CPF");
       jLabelLogra.setText("Logradouro");
       jLabelNum.setText("Numero");
       jLabelBairro.setText("Bairro");
       jLabelCidade.setText("Cidade");
   }
   
   public void nomeLabelEstoque()
   {
       jLabelNome.setText("Nome");
       jLabelCPF.setText("Marca");
       jLabelLogra.setText("Fornecedor");
       jLabelNum.setText("Código");
       jLabelBairro.setText("Entrada");
       jLabelCidade.setText("Saída");
   }
   
   public void nomeLabelVenda()
   {
       jLabelNome.setText("Nome");
       jLabelCPF.setText("CPF");
       jLabelLogra.setText("Valor vendido");
       jLabelNum.setText("");
       jLabelBairro.setText("");
       jLabelCidade.setText("");
   }
           
    
    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        status(true);
        Cliente c1 = new Cliente();
        c1.cadastrar(c1);
        tu += "" + c1 + "\n";
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        
        anterior.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTextFieldLograActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLograActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLograActionPerformed

    private void jTextFieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadeActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
    
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBairroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Acompanhamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acompanhamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acompanhamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acompanhamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acompanhamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonEstoque;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonVendas;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelLogra;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNum;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldLogra;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNum;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
