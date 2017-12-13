package trabalhopoo;
import java.util.Scanner;
public class Acompanhamento extends javax.swing.JFrame 
{
    public Acompanhamento() {
        initComponents();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaControle = new javax.swing.JTextArea();
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

        jTextAreaControle.setColumns(20);
        jTextAreaControle.setRows(5);
        jScrollPane2.setViewportView(jTextAreaControle);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(140, 100, 440, 110);

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
        String str = jTextAreaControle.getText(); /* Vai pegar tudo até a primeira quebra de linha. Garanta que o número é válido!*/
        int i = 0;
        try 
        {
            i = Integer.parseInt(str); // Caso você queira tipo int, que é o usual.
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
        jTextAreaControle.setText(tu);
    }//GEN-LAST:event_jButtonEstoqueActionPerformed
String tu;
    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        AreaDeUsuario principal = new AreaDeUsuario();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaControle;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
