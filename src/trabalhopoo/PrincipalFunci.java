package trabalhopoo;

import javax.swing.JOptionPane;

public class PrincipalFunci extends javax.swing.JFrame {
    public PrincipalFunci() {
        initComponents();
        status(false);
    }
    AreaDeUsuario anterior;
    public PrincipalFunci(AreaDeUsuario anterior) {
        initComponents();
        status(false);
        this.anterior=anterior;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCadastro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButtonCompras = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonVendas = new javax.swing.JButton();
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
        texto = new javax.swing.JTextField();
        editar = new javax.swing.JTextField();
        editar = new javax.swing.JTextField();
        vender = new javax.swing.JButton();
        Comprar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funcionário");
        getContentPane().setLayout(null);

        jButtonCadastro.setText("CADASTRO");
        jButtonCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastro);
        jButtonCadastro.setBounds(20, 120, 100, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhopoo/pooo.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 10, 122, 55);

        jButton6.setText("SAIR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(520, 400, 57, 23);

        jButtonCompras.setText("COMPRAS");
        jButtonCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCompras);
        jButtonCompras.setBounds(20, 203, 100, 20);

        jButtonVoltar.setText("VOLTAR");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(10, 400, 100, 23);

        jButtonVendas.setText("VENDAS");
        jButtonVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVendas);
        jButtonVendas.setBounds(20, 270, 100, 23);

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(290, 120, 220, 20);
        jTextFieldNome.setVisible(false);
        getContentPane().add(jTextFieldCPF);
        jTextFieldCPF.setBounds(290, 150, 220, 20);
        jTextFieldCPF.setVisible(false);

        jTextFieldLogra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLograActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldLogra);
        jTextFieldLogra.setBounds(290, 180, 220, 20);
        jTextFieldLogra.setVisible(false);
        getContentPane().add(jTextFieldNum);
        jTextFieldNum.setBounds(290, 210, 220, 20);
        jTextFieldNum.setVisible(false);

        jTextFieldBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBairro);
        jTextFieldBairro.setBounds(290, 240, 220, 20);
        jTextFieldBairro.setVisible(false);

        jTextFieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCidade);
        jTextFieldCidade.setBounds(290, 270, 220, 20);
        jTextFieldCidade.setVisible(false);

        jLabelNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNome.setText("Nome");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(180, 120, 70, 20);
        jLabelNome.setVisible(false);

        jLabelCPF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCPF.setText("CPF");
        getContentPane().add(jLabelCPF);
        jLabelCPF.setBounds(180, 150, 70, 30);
        jLabelCPF.setVisible(false);

        jLabelLogra.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelLogra.setText("Logradouro");
        getContentPane().add(jLabelLogra);
        jLabelLogra.setBounds(180, 180, 100, 20);
        jLabelLogra.setVisible(false);

        jLabelNum.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNum.setText("Numero");
        getContentPane().add(jLabelNum);
        jLabelNum.setBounds(175, 210, 70, 20);
        jLabelNum.setVisible(false);

        jLabelBairro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelBairro.setText("Bairro");
        getContentPane().add(jLabelBairro);
        jLabelBairro.setBounds(180, 240, 80, 15);
        jLabelBairro.setVisible(false);

        jLabelCidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCidade.setText("Cidade");
        getContentPane().add(jLabelCidade);
        jLabelCidade.setBounds(180, 270, 90, 15);
        jLabelCidade.setVisible(false);

        texto.setEditable(false);
        texto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        texto.setVisible(false);
        texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoActionPerformed(evt);
            }
        });
        getContentPane().add(texto);
        texto.setBounds(520, 0, 240, 390);

        editar.setVisible(false);
        getContentPane().add(editar);
        editar.setBounds(130, 270, 6, 20);
        editar.setSize(50, 20);

        vender.setVisible(false);
        vender.setText("Compar");
        vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderActionPerformed(evt);
            }
        });
        getContentPane().add(vender);
        vender.setBounds(290, 300, 69, 23);

        Comprar.setVisible(false);
        Comprar.setText("Comprar");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });
        getContentPane().add(Comprar);
        Comprar.setBounds(290, 300, 73, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhopoo/fundo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 450);

        setSize(new java.awt.Dimension(888, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed
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
    public void limpar(){
        jTextFieldNome.setText("");
        jTextFieldCPF.setText("");
        jTextFieldLogra.setText("");
        jTextFieldNum.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
    }

boolean pessoa=false,produto=false,funcionario=false;
public void pessoa(){
    limpar();
    status(true);
    jLabelNome.setText("Nome");
    jLabelCPF.setText("CPF");
    jLabelLogra.setText("Logradouro");
    jLabelNum.setText("Numero");
    jLabelBairro.setText("Bairro");
    jLabelCidade.setText("Cidade");
    jButtonCadastro.setVisible(true);
    jButtonCompras.setVisible(true);
    jButtonCompras.setText("Listar");
    jButtonVendas.setVisible(false);
    vender.setVisible(false);
    produto=false;
    pessoa=true;
    funcionario=false;
}
public void funcionario(){
    limpar();
    status(true);
    jLabelNome.setText("Nome");
    jLabelCPF.setText("CPF");
    jLabelLogra.setText("Logradouro");
    jLabelNum.setText("Numero");
    jLabelBairro.setText("Bairro");
    jLabelCidade.setText("Cidade");
    jButtonCadastro.setVisible(true);
    jButtonCompras.setVisible(true);
    jButtonCompras.setText("Listar");
    jButtonVendas.setVisible(false);
    vender.setVisible(false);
    produto=false;
    pessoa=false;
    funcionario=true;
}



public void produto(){
        limpar();
        status(true);
        jButtonCompras.setText("Compras");
        jLabelNome.setText("Nome");
        jLabelCPF.setText("Marca");
        jLabelLogra.setText("Revendedor");
        jLabelNum.setText("Quantidade");
        jLabelBairro.setText("Preco compra");
        jLabelCidade.setText("Valor revenda");
        jButtonCadastro.setVisible(false);
         jButtonCompras.setVisible(true);
        jButtonVendas.setVisible(true);
        vender.setVisible(false);
        produto=true;
        pessoa=false;
        funcionario=false;
}
    private void jButtonCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroActionPerformed
            if(retorn){
                retorno();
                retorn=false;
            }
            else
                if(jTextFieldNome.getText().equals("") || jTextFieldCPF.getText().equals("") || jTextFieldLogra.getText().equals("") || jTextFieldNum.getText().equals("") || jTextFieldBairro.getText().equals("") || jTextFieldCidade.getText().equals(""))
                     JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            else{
                if(pessoa){
                   anterior.cliente.add(new Cliente(jTextFieldNome.getText(),jTextFieldCPF.getText(),jTextFieldLogra.getText(),Integer.parseInt(jTextFieldNum.getText()),jTextFieldBairro.getText(),jTextFieldCidade.getText()));
                   limpar();
                }
                if(funcionario){
                    anterior.funcionarios.add(new Funcionario(jTextFieldNome.getText(),jTextFieldCPF.getText(),jTextFieldLogra.getText(),Integer.parseInt(jTextFieldNum.getText()),jTextFieldBairro.getText(),jTextFieldCidade.getText()));
                    limpar();
                }
            }
      
    }//GEN-LAST:event_jButtonCadastroActionPerformed

    private void jButtonVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendasActionPerformed
        if(pessoa){
            int i;
            try{i=Integer.parseInt(editar.getText());}
            catch(Exception e){JOptionPane.showMessageDialog(null, "valor invalido");}
            
            Cliente aux = (Cliente)anterior.cliente.get(Integer.parseInt(editar.getText())-1);
            texto.setVisible(false);
            
            pessoa();
            anterior.cliente.remove(aux);
            jTextFieldNome.setText(aux.getNome());
            jTextFieldCPF.setText(aux.cpf);
            jTextFieldLogra.setText(aux.logradouro);
            jTextFieldNum.setText(""+aux.numero);
            jTextFieldBairro.setText(aux.bairro);
            jTextFieldCidade.setText(aux.cidade);
            texto.setVisible(false);
        }
        if(funcionario){
            int i;
            try{i=Integer.parseInt(editar.getText());}
            catch(Exception e){JOptionPane.showMessageDialog(null, "valor invalido");}
            
            Funcionario aux = (Funcionario)anterior.funcionarios.get(Integer.parseInt(editar.getText())-1);
            texto.setVisible(false);
            funcionario();
            anterior.funcionarios.remove(aux);
            jTextFieldNome.setText(aux.getNome());
            jTextFieldCPF.setText(aux.cpf);
            jTextFieldLogra.setText(aux.logradouro);
            jTextFieldNum.setText(""+aux.numero);
            jTextFieldBairro.setText(aux.bairro);
            jTextFieldCidade.setText(aux.cidade);
            texto.setVisible(false);
        }
        if(produto){
            produto();
            status(false);
            Comprar.setVisible(false);
            texto.setVisible(true);
            jTextFieldNome.setVisible(true);
            jTextFieldCPF.setVisible(true);
            jLabelNome.setText("Nome");
            jLabelNome.setVisible(true);
            jLabelCPF.setText("quantidade");
            jLabelCPF.setVisible(true);
            Comprar.setVisible(false);
            vender.setVisible(true);
            String str="";
            texto.setVisible(true);
            
            Comprar.setVisible(true);
            vender.setVisible(false);
            Produto aux;
            for (int i=0;i<anterior.cliente.size();i++){
               aux=(Produto) anterior.estoque.produtos.get(i);
               
               str+=(aux.getNome()+" Quantidade: "+aux.getQuantidade()+ "código: "+(i+1)+"\n");
                
            }
            texto.setText(str);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVendasActionPerformed
    public void retorno(){
        texto.setVisible(false);
        status(true);
    }
    boolean retorn=false;
    private void jButtonComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprasActionPerformed
        if(pessoa || funcionario)
            retorn = true;
        
        if(pessoa){
            jButtonVendas.setVisible(true);
            jButtonVendas.setText("editar:");
            editar.setVisible(true);
            status(false);
            String str="";
            texto.setVisible(true);
            Cliente aux;
            for (int i=0;i<anterior.cliente.size();i++){
               aux=(Cliente)anterior.cliente.get(i);
               str+=(aux.nome+"  código: "+(i+1)+"\n");
                
            }
            texto.setText(str);
                
        }
        else if(funcionario){
            status(false);
            String str="";
            jButtonVendas.setVisible(true);
            jButtonVendas.setText("editar:");
            editar.setVisible(true);
            texto.setVisible(true);
            Funcionario aux;
            for (int i=0;i<anterior.funcionarios.size();i++){
               aux=(Funcionario)anterior.funcionarios.get(i);
               str+=("nome: "+aux.nome+"  código: "+(i+1)+"/n");
                
            }
            texto.setText(str);
        }
        else if (produto){
            
            produto();
            Comprar.setVisible(true);
            texto.setVisible(false);
            
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonComprasActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        
        anterior.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed

    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldLograActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLograActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLograActionPerformed

    private void jTextFieldBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBairroActionPerformed

    private void jTextFieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadeActionPerformed

    private void textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoActionPerformed

    private void venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderActionPerformed
        if(jTextFieldNome.equals("")||jTextFieldCPF.equals(""))
            JOptionPane.showMessageDialog(null, "valor invalido");
        else{
            vender.setVisible(true);
            Produto aux;
            aux=(Produto)anterior.estoque.produtos.get(Integer.parseInt(jTextFieldNome.getText())-1);
            int i = Integer.parseInt(jTextFieldCPF.getText());
            anterior.estoque.Saida(aux, i);
            
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_venderActionPerformed

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        Produto p = new Produto(jTextFieldNome.getText(),jTextFieldCPF.getText(),jTextFieldLogra.getText(),Integer.parseInt(jTextFieldNum.getText()),Integer.parseInt(jTextFieldBairro.getText()),Integer.parseInt(jTextFieldCidade.getText()));
        anterior.estoque.Entrada(p, Integer.parseInt(jTextFieldNum.getText()));
        // TODO add your handling code here:
    }//GEN-LAST:event_ComprarActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalFunci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFunci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFunci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFunci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFunci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comprar;
    private javax.swing.JTextField editar;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonCadastro;
    private javax.swing.JButton jButtonCompras;
    private javax.swing.JButton jButtonVendas;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelLogra;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNum;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldLogra;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNum;
    private javax.swing.JTextField texto;
    private javax.swing.JButton vender;
    // End of variables declaration//GEN-END:variables

    private void jButton1(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
