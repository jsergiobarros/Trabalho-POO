package trabalhopoo;
public class AreaDeUsuario extends javax.swing.JFrame {
    public AreaDeUsuario() {
        initComponents();
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        menuBar3 = new java.awt.MenuBar();
        menu5 = new java.awt.Menu();
        menu6 = new java.awt.Menu();
        menuBar4 = new java.awt.MenuBar();
        menu7 = new java.awt.Menu();
        menu8 = new java.awt.Menu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButtonProdutos = new javax.swing.JButton();
        jButtonCliente = new javax.swing.JButton();
        jButtonFuncionario = new javax.swing.JButton();
        jButtonControle = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        menu5.setLabel("File");
        menuBar3.add(menu5);

        menu6.setLabel("Edit");
        menuBar3.add(menu6);

        menu7.setLabel("File");
        menuBar4.add(menu7);

        menu8.setLabel("Edit");
        menuBar4.add(menu8);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Área de Usuário");
        getContentPane().setLayout(null);

        jButtonProdutos.setText("PRODUTOS");
        jButtonProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProdutos);
        jButtonProdutos.setBounds(10, 120, 120, 23);

        jButtonCliente.setText("CLIENTE");
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCliente);
        jButtonCliente.setBounds(10, 170, 120, 23);

        jButtonFuncionario.setText("FUNCIONÁRIOS");
        jButtonFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFuncionario);
        jButtonFuncionario.setBounds(10, 70, 120, 23);

        jButtonControle.setText("CONTROLE");
        jButtonControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonControleActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonControle);
        jButtonControle.setBounds(10, 220, 120, 23);

        jButtonSair.setText("SAIR");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(510, 400, 57, 23);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 70, 440, 180);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("PRINCIPAL");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 20, 94, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhopoo/pooo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 455, 122, 55);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhopoo/fundo.jpg"))); // NOI18N
        jLabel3.setText("jLabelFundo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 599, 450);

        setSize(new java.awt.Dimension(615, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButtonProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProdutosActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncionarioActionPerformed
        PrincipalFunci funcionario = new PrincipalFunci();
        funcionario.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonFuncionarioActionPerformed

    private void jButtonControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonControleActionPerformed
        Acompanhamento acomp = new Acompanhamento();
        acomp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonControleActionPerformed

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
            java.util.logging.Logger.getLogger(AreaDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreaDeUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonControle;
    private javax.swing.JButton jButtonFuncionario;
    private javax.swing.JButton jButtonProdutos;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.Menu menu5;
    private java.awt.Menu menu6;
    private java.awt.Menu menu7;
    private java.awt.Menu menu8;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private java.awt.MenuBar menuBar3;
    private java.awt.MenuBar menuBar4;
    // End of variables declaration//GEN-END:variables
}
